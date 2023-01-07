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
public class RightRotate {

    public static int[] rightRotate(int[] array) {
        int[] a = array;
        int first = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = first;

        return a;
    }

    public static void main(String args[]) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 3; i++) {
            rightRotate(array);
        }
        
        for(int j = 0 ; j < array.length; j++){
            System.out.print(" "+ array[j]);
        }
    }

}
