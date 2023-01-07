/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author vamsee.n
 */
public class MainClass {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        JavaSerialization js = new JavaSerialization(1, "vamsee", 2.0f, "Anuradha");
        FileOutputStream fos = new FileOutputStream(new File("serialization.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Serialization start");
        oos.writeObject(js);
        oos.close();
        System.out.println("Serializatin end");
        
        FileInputStream fis = new FileInputStream("serialization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        System.out.println("Object deserialization start");
        Object o = (JavaSerialization) ois.readObject();
        //System.out.println("data in object "+);
        printdata((JavaSerialization) o);
        System.out.println("Object deserialization end");
    }
    public static void printdata(JavaSerialization object1)
    {
  
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.password);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }
    
}
