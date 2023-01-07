/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

/**
 *
 * @author vamsee.n
 */
 interface test {
    void display1();
    default void display(){
        System.out.println("display from test");
    }
    
}
public class Derived_class{
    public void main_method(){
        System.out.println("derived class");
    }
    public void main_method1(){
        System.out.println("main method one ");
    }
    public static void main(String[] args) {
        Derived_class t = new Derived_class();
        test t1  = t::main_method1;
        
        t1.display1();
    }
}