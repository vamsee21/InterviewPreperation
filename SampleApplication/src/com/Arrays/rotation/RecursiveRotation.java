/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Arrays.rotation;

/**
 *
 * @author vamsee.n
 */
public class RecursiveRotation {
    static int temp;
    
    public static void main(String [] args){
        int a[] = new int[]{1,2,3,4,5,6,7};
        leftRotation(a, 3);
        for(int i = 0; i < a.length; i++){
            System.out.println(" array "+ a[i]);
        }
    }
    public static void leftRotation(int a[], int d){
    if(d == 0){
        return;
    }
    
    int n = a.length;
    
    d = d % n;
    
        reverseArray(a, 0, d-1);
        reverseArray(a, d, n-1);
        reverseArray(a, 0, n-1);
}   
    public static void reverseArray(int a[],int start,int end){
        while(start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    
}
