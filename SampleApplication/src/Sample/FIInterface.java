/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vamsee.n
 */
@FunctionalInterface
public interface FIInterface {
    
    
    public static void main(String [] args){
        
        List l = new ArrayList();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        
        l.forEach(s -> System.out.println("display "+s));
        
        
        try{
            int i = 10/0;
        }catch(RuntimeException re){
            System.out.println("inside catch block");
            return;
        }finally{
            System.out.println("I am finally block");
        }
    }
    public void method1();
    default void method2(){
        System.out.println("default");
    }
    static void method3(){
        System.out.println("method 3");
    }
    default void method4(){
        System.out.println("default");
    }
    static void method5(){
        System.out.println("method 3");
    }
}
