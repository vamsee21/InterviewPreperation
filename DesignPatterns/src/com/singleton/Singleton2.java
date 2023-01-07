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
public enum Singleton2 {
    
    DataBaseconnection ;
    
    public DataBaseConnection getInstance(){
        DataBaseConnection connection = DataBaseConnection.getConnection();
        return connection;
    }
}
