/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package come.interview.RotateArray;

import java.util.Arrays;

/**
 *
 * @author vamsee.n
 */
public class CountTriangles {
    public static void main(String[] args) {
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        
        Arrays.sort(arr);
        
        
        for(int a = 0; a < arr.length; a++ ){
            System.out.print("  "+arr[a]);
        }
        int count = 0;
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++ ){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i]+arr[j]>arr[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("Count of the triangles "+count);
    }
}
