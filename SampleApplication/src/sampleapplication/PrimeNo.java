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
public class PrimeNo {
    
    
    public static void  isPrime(int number){
        boolean isTrue = false;
        if(number == 2 || number == 3){
            isTrue = true;
        }
        if(number % 2 == 0){
            isTrue = false;
        }
        
        
        int sqrt = (int) Math.sqrt(number) + 1;
        
        for(int i =3; i < sqrt; i +=2){
            if (number % i == 0){
                isTrue = false;
            }else{
                isTrue = true;
            }
        }
        
        if(isTrue){
            System.out.println("Input is Prime number "+number);
        }else{
            System.out.println("Input is not prime number "+ number);
        }
    }
    public static void main(String [] args){
        isPrime(11);
        //System.out.println("print the value of sqrt"+(int)Math.sqrt(5) +1);
    }
    
}
