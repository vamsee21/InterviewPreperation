/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package come.interview.RotateArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author vamsee.n
 */
public class AllZeroToEnd {
    
    public static void main(String args[]){
       /* int array [] = new int []{2,0,4,0,6,0};
         int k = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                System.out.println("value as zero");
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
                k++;
            } 
        }
        
        for(int j = 0 ; j < array.length; j++){
            System.out.print(array[j]);
        } */
        
        
        ArrayList list = new ArrayList(Arrays.asList(2,0,4,0,6,0));
        int size = list.size();
        for(int i = 0; i < list.size(); i++){
            System.out.println("first if condition"+list.get(i).equals(0)+"  "+list.size()+"     "+list.get(i));
            if(list.get(i).equals(0)){
                System.out.println("first if condition 111");
                list.remove(i);
            }
        }
        System.out.println("second for loop "+list.size()+"  "+list);
        for(int j = list.size(); j < size; j++){
            list.add(0);
        }
        
        for(int k = 0; k < list.size();k++){
            System.out.println(list.get(k));
        }
        
    }
    
}
