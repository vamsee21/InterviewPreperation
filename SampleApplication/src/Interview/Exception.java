/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

/**
 *
 * @author vamsee.n
 */
public class Exception {
    
    
    public static void main(String arg [] ){
        System.out.println("before execute the catch block");
        try{
            int a =0/0;
        }catch(RuntimeException ex){
            //throw new RuntimeException();
            System.out.println("after execute the catch block "+ex);
        }
        System.out.println("after execute the catch block");
        
        
    }
    
}
