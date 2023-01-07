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
public class LeftRotate {
    
    public static int[] leftRotate(int [] array){
        
            int last = array[array.length-1];
        for(int j = array.length-1 ; j > 0 ; j--){
            System.out.println("value "+j +"  "+(j-1));
            array[j] = array[j-1];
        }
        System.out.println("value "+last);
        array[0] = last;
        return array;
    }
    
    public static void main(String args []){
        int [] array = new int[]{1,2,3,4,5,6,7};
        for(int i = 0;i < 2; i++){
            leftRotate(array);
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(" "+array[i]);
        }
    }
}
