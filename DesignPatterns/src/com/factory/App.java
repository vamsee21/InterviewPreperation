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
public class App
{
    public static void main(String[] args) {
        System.out.println("Lite Combo Details  \n");
        Combo combo = new CreateCombo().getComboDetails(ComboType.LITE);
        combo.print_Items();
        
        
        System.out.println("Family  Combo Details \n");
        Combo combo1 = new CreateCombo().getComboDetails(ComboType.FAMILY);
        combo1.print_Items();
        
        
        System.out.println("Mega Combo Details  \n");
        Combo combo2 = new CreateCombo().getComboDetails(ComboType.MEGA);
        combo2.print_Items();
        
    }
    
}
