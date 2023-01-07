/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BuilderPattern;

/**
 *
 * @author vamsee.n
 */
public class App {
    public static void main(String[] args) {
        Human human = new Human.HumanBuilder().setAge(20).setBirthPlace("Bengaluru").setEyesColor("red").setHairColor("Black").build();
        System.out.println(human.toString());
    }
}
