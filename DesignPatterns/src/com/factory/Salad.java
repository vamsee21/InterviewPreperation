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
public class Salad extends RegularOrder{
    int price = 300;
    String item = "Salad";
    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", item, price);
    }

}
