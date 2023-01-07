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
public class Rotate {
    public static void main(String[] args) {
        int a[] = new int[]{1,7,8,2,5,4};
        int temp = a[a.length-1];
       /* for(int i = 0 ; i < a.length-1; i++){
            a[i] = a[i+1];
            
        }
        a[a.length-1] =temp;
        */
        
        for(int i = a.length -1; i > 0; i --){
            a[i] = a[i-1];
        }
        a[0] = temp;
        for(int j = 0 ; j < a.length; j++){
            System.out.print(" "+a[j] );
        }
    }
}
