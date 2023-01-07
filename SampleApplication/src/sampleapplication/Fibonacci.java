/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;

/**
 *
 * @author vamsee.n
 */
public class Fibonacci {
    
    public static int fibonacci(int number){
        if(number == 1 || number == 2 ){
            return 1;
        }
        return fibonacci(number -1) + fibonacci(number - 2);
    }
    
    
    
    public static void main(String args []){
        int total = fibonacci(5);
        System.out.println("total  "+total);
        
    }
}
