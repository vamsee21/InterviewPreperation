/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;

/**
 *
 * @author vamsee.n
 */
public class ArrayEqualCheck {
    
    public static boolean arrayEqualCheck(int []a ,int []a1){
    boolean equalOrNot = true;
    
    if(a.length == a1.length){
        for(int i =0; i < a.length; i++){
            if(a[i] != a1[i]){
                equalOrNot =false;
            }
        }
    } else{
        equalOrNot = false;
    }
    if(equalOrNot){
        System.out.println("Both arrays are equal");
    }else{
        System.out.println("Arrays are not equal");
    }
   return equalOrNot;         
}
    
    public static void main(String [] args){
        int a [] = {1,2,4};
        int a1[] = {1,2,3};
        
        arrayEqualCheck(a,a1);
        
    }
}
