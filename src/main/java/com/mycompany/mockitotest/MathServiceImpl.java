/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mockitotest;


public class MathServiceImpl implements MathService {
 
    public long doubleLong(long num) {
        return 2 * num;
    }
 
    public long tripleLong(long num) {
        return 3 * num;
    }
 
    public long addition(long... nums) {
        int sum = 0;
        for (long a : nums) sum += a;
        return sum;
    }
}
