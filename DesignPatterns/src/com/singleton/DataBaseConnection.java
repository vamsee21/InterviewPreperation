/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singleton;

/**
 *
 * @author vamsee.n
 */
public class DataBaseConnection implements Cloneable{
    
    private static DataBaseConnection connection;
    
    private DataBaseConnection(){
        
    }
    
    public static DataBaseConnection getConnection(){
        if(connection == null){
            connection = new DataBaseConnection();
        }
        return connection;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

     
}
