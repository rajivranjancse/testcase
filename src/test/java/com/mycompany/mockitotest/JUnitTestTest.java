/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mockitotest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class JUnitTestTest {
    
    public JUnitTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setup method, of class JUnitTest.
     */
    @Test
    public void testSetup() {
        System.out.println("setup");
        JUnitTest instance = new JUnitTest();
        instance.setup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of test_doubleLong_Pass method, of class JUnitTest.
     */
    @Test
    public void testTest_doubleLong_Pass() {
        System.out.println("test_doubleLong_Pass");
        JUnitTest instance = new JUnitTest();
        instance.test_doubleLong_Pass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of test_doubleLong_Inject method, of class JUnitTest.
     */
    @Test
    public void testTest_doubleLong_Inject() {
        System.out.println("test_doubleLong_Inject");
        JUnitTest instance = new JUnitTest();
        instance.test_doubleLong_Inject();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
