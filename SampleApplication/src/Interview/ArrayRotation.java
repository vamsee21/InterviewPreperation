/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

/**
 *
 * @author vamsee.n
 */
public class ArrayRotation {
    
    public static void main(String[] args) {
        int [] a = new int[]{5,2,7,1,8};
        //int temp [] = leftRotation(a, 5, 3);
        int temp [] = rightRotation(a, 5, 4);
        for(int i = 0 ; i < temp.length; i++){
                System.out.print("  "+temp[i]);
            }
            System.out.println();
        
    }
    public static int[] leftRotation(int[] a,int l,int k){
        System.out.println("left rotation ");
        int temp[] = new int[l];
        int n = k;
            for(int i =n, j=0; i < l+n; i++){
                temp [j] = a[i%l];
                j++;
                System.out.println(" "+a[i%l]+"   "+ (k-n));
            }
            
            System.out.println("\n array temp "+temp.toString());
            return temp;
                
    }
    
    public static int[] rightRotation(int [] a, int length,int startPosition){
        int[] temp = new int[length];
        
        for(int i = length - startPosition,j = 0; i< length+startPosition;i++){
            temp[j] = a[i%length];
            j++;
            
            System.out.println(" "+a[i%length]);
            if(j >= length){
                break;
            }
        }
        return temp;
    }
}
