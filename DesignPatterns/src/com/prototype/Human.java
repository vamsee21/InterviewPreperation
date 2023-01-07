/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prototype;

/**
 *
 * @author vamsee.n
 */
public class Human {
    
    private String name;
    private String lastName;
    private int age;
    
    public Human(){
        System.out.println("Human resource start");
        System.out.println("--------------------------------");
        System.out.println("name"+"   "+"lastName"+"   "+"age");
        
    }
    
    public Human(String name,String lastName,int age){
        this();
        this.age = age;
        this.lastName = lastName;
        this.name = name;
        showData();
    }
    
    private void showData(){
        System.out.println(name+"   "+lastName+"  "+age);
    }

    
    protected Object getClone() throws CloneNotSupportedException {
        return new Human(name, lastName, age);
    }
    
    
}
