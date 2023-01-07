/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author vamsee.n
 */
public abstract class Combo {
    List<RegularOrder> comboOrder = new ArrayList();
    
    public abstract void comboCreate();
    
    public void print_Items(){
        comboOrder.stream().forEach((RegularOrder item) -> {
            item.printOrder();
        });
    }
    
}
