/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory;

/**
 *
 * @author vamsee.n
 */
public class Deserts extends RegularOrder{
    int price = 200;
    String item = "Deserts";
    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", item, price);
    }
   }

