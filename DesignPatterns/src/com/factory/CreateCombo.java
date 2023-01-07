/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory;

import java.util.List;

/**
 *
 * @author vamsee.n
 */
public class CreateCombo {
    
    public Combo getComboDetails(ComboType comboType){
        switch(comboType){
            case LITE:
                return new LiteCombo(); 
            case FAMILY:
                return new FamilyCombo();
            case MEGA:
                return new MegaCombo();
                
            default:
               System.out.println("No Combo selected");
                
        }
        return null;
    }
}
