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
public class RearrangeArrayWithMinusOne {
    public static void main(String[] args) {
       int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
       int copy [] = arr.clone();
       boolean flag = false;
       for(int i = 0 ; i < arr.length; i++){
           for(int j = 0 ; j < arr.length; j++){
               System.out.println("copy [j]  "+copy[j]+"   j "+j +"   "+ i );
               if(copy[j] ==  i){
                   arr[i] = copy[j]; 
                   flag = false;
                   break;
               }
               flag = true;
               //System.out.println("flag value "+flag);
           }
           System.out.println("flag value "+flag);
           if(flag){
               arr[i] = -1;
           }
           
          
            System.out.println("");
          }
        for(int k = 0; k < arr.length; k++){
           System.out.print(" "+arr[k]);
          
       }
       
    }
}
