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
public class KthSmallestElement {
    public static void main(String[] args) {
        int a[] = new int[]{4,1,45,7,2,24};
        for(int i = 0; i < a.length ; i++){
            for(int j = 0; j < a.length; j++){
            if(a[i] < a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        }
        for(int k = 0;k < a.length ; k++){
            System.out.print(" "+a[k]);
        }
        int kth = 3;
        System.out.println("");
        System.out.println(a[kth - 1]);
        
        System.out.println("find largest three numbers");
        for(int l = a.length -3; l < a.length; l++){
            System.out.print(" "+a[l]);
        }
        
        System.out.println("find largest second largest element");
        System.out.println(" second "+a[a.length-2]);
    }
}
