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
public class Beverages extends RegularOrder{
    int price =500;
    String item = "Beverages";
    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", item, price);
    }

}
