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
public class StringLongPrefix {
    public static void main(String args []){
    String array [] = {"abcdefgh","aefghijk","abcefgh"};
    char charArray [] ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
    String concat = "";
    String longPrefix = null;
    for(int i = 0; i < charArray.length; i++){
    concat = concat + String.valueOf(charArray[i]);
    
    for(int j= 0; j < array.length; j++){
         array[j].startsWith(concat);
         longPrefix = array[j];
    }
}
    System.out.println("long prefix "+longPrefix);
    }
}
