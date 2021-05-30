/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mockitotest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import com.mycompany.mockitotest.MathService;
import com.mycompany.mockitotest.MathServiceImpl;

 
@RunWith(MockitoJUnitRunner.class)
public class JUnitTest {
 
    @Mock
    MathService mathService;
 
    @InjectMocks
    MathServiceImpl mathServiceImpl = new MathServiceImpl();
 
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
 
    @Test
   
    public void test_doubleLong_Pass() {
        long expected = 20;
        Mockito.when(mathService.doubleLong(Mockito.anyLong())).thenReturn(expected);
 
        long actual = mathService.doubleLong(Mockito.anyLong());
        Assert.assertEquals(expected, actual);
    }
 
    @Test
    public void test_doubleLong_Inject() {
        long expected = 20;
        //this method is actually called
        long actual = mathServiceImpl.doubleLong(10);
 
        Assert.assertEquals(expected, actual);
    }
 
}
