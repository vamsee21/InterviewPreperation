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
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human("vamsee","Nagaiahgari", 35);
    
    Human human2 = (Human) human.getClone();
    }
    
}
