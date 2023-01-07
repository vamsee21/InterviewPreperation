/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kafkaproducer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author vamsee.n
 */
public class ReflectionClass {
    
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
             Class producer = Class.forName("com.mycompany.kafkaproducer.Producer");
         Method mthd[] = producer.getDeclaredMethods();  
           
           
         for(int i = 0; i < mthd.length; i++) {  
             if(mthd[i].getName().equalsIgnoreCase("m1")){
                 mthd[i].invoke(producer.newInstance());
             }
            System.out.println("Method (" +(i+1)+ ")" +mthd[i].toString()); //get the methods and convert into string  
         }  
   }  
            
    
}
