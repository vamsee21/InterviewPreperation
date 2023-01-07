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
public class LiteCombo extends Combo{
    
    public LiteCombo(){
       comboCreate();
    }

    @Override
    public void comboCreate() {
        comboOrder.add(new Meals());
        comboOrder.add(new Beverages());
    }
    
}
