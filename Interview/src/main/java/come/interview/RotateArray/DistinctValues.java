/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package come.interview.RotateArray;

/**
 *
 * @author vamsee.n
 */
public class DistinctValues {
    
    public static void main(String[] args) {
       int a []= {12, 10, 9, 45, 2, 10, 10, 45};
       for(int i = 0; i < a.length; i++){
           int count = 0;
           for(int j = 0; j < a.length; j++){
               
               if(a[i] == a[j]){
                   count++;
               }
           }
           if(count ==1){
               System.out.println("Unique values   "+ a[i]);
           }
       }
       
    }
}
