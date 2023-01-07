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
public class RearrangePositiveNegative {
    public static void main(String[] args) {
        int arr [] ={-1, 2, -3, 4, 5, 6, -7, 8, 9};
    
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int k = 0; k < arr.length; k++){
            System.out.println("  "+arr[k]);
        }
    }
}
