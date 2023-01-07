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
public class EvenFirstOddLater {
    public static void main(String[] args) {
        int arr [] = new int[]{1,3,2,4,7,5,6,9};
        int temp [] = arr.clone();
         int min = 0 , max = arr.length-1;
         
        for(int i = 0; i < arr.length; i++){
            if(temp[i] % 2 == 0){
                arr[min] = temp[i];
                int inc = min++;
                
                System.out.println(" values "+temp[i] +"     "+inc);
            }else{
                arr[max] = temp[i];
                max--;
            }
        }
        
        for(int j =0 ; j < arr.length;j++){
            System.out.print(" "+arr[j]);
        }
    }
}
