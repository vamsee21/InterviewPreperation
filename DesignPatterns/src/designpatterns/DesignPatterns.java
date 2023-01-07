/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import com.singleton.DataBaseConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author vamsee.n
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        
       System.out.println("object from original "+DataBaseConnection.getConnection());
       DataBaseConnection con = (DataBaseConnection) DataBaseConnection.getConnection().clone();
       
       System.out.println("object from original "+con +"   hashcode");
    }
    
}
