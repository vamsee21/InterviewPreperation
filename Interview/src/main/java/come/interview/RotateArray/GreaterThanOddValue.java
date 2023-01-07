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
public class GreaterThanOddValue {
    public static void main(String[] args) {
        int array [] = new int[]{2,1,2,1,1,3};
        
        for(int i = 0;i < array.length; i++){
            if(array[i] < array[i+1]){
                
            }else{
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            i= i+1;
        }
        
        
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j]);
        }
    }
}
