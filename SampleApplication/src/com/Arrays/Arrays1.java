/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Arrays;

/**
 *
 * @author vamsee.n
 */
public class Arrays1 {
    public static void main(String arg[]){
        int a[] = {1,2,3,4,5,6};
        int b[] = new int[]{1,2,3,4,5,6};
        int a1[][] = new int[][]{{2,7,9},{3,6,1},{7,4,2},{1,2,3}} ;
        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(a1[i][j] + " ");
 
            System.out.println();
        }
    }
}
