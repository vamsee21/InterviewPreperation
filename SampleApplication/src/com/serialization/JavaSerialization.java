/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serialization;

import java.io.Serializable;

/**
 *
 * @author vamsee.n
 */
public class JavaSerialization implements Serializable{
    
    int a ;
    String name;
    float b;
    transient String password;
    
    JavaSerialization(int a,String name,float b,String password){
        this.a =a;
        this.name = name;
        this.b = b;
        this.password = password;
    }
    
}
