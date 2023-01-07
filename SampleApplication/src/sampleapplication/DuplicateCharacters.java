/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;

import java.util.HashSet;

/**
 *
 * @author vamsee.n
 */
public class DuplicateCharacters {
    public static void isStringAsDuplicateChars(String s){
        char [] c1 = s.toCharArray();
        int l =c1.length;
        HashSet has = new HashSet();
        for(int i =0; i < l; i++){
            has.add(c1[i]);
            System.out.println(" chars "+c1[i]);
        }
        System.out.println(" size "+l +"   "+has.size());
        if(l == has.size()){
            System.out.println("No Duplicate chars in String");
        }else{
            System.out.println("String has duplicate chars");
        }
        
    }
    
    public static void main(String args []){
        isStringAsDuplicateChars("abcdef");
    }
}
