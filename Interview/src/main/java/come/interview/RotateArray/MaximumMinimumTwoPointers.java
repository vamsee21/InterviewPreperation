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
public class MaximumMinimumTwoPointers {
    public static void main(String[] args) {
        int array [] = new int[]{5,3,6,2,8,1,7,4,9};
        for(int k = 0; k < array.length ; k++){
        for(int i = 0; i < array.length; i++){
            if(array[k] < array[i]){
                int temp = array[i];
                array[i]= array[k];
                array[k] = temp;
            }
           
        }
        }
        /*    for(int j = 0 ; j < array.length; j++){
            System.out.print(" "+array[j]);
        }
            int temp1 [] = array.clone();
            boolean flag = true;
            int large = array.length -1;           
            int small = 0;
        // Store result in temp[]
        for (int i = 0; i < array.length; i++) {
            
            
            if (flag)
                array[i] = temp1[large--];
            else
                array[i] = temp1[small++];
  
            flag = !flag;
            System.out.println("inside loop flag value "+flag +"   "+array[i]);
        }
        
            for(int c = 0 ; c < array.length; c++){
            System.out.print(" "+array[c]);
        }*/
        
        
        
        int max =array.length -1, min = 0;
        int max_elem = array[array.length-1]+1;
        System.out.println("max elem "+max_elem);
        for(int i = 0 ; i < array.length; i++){
            if(i % 2 == 0){
                array[i] += (array[max] % max_elem ) * max_elem;
                max--;
            }else{
                array[i] += (array[min] % max_elem ) * max_elem;
                min++;
            }
        }
        
        for(int j = 0 ; j < array.length; j++){
            array[j] = array[j] / max_elem;
        }
        
        for(int k = 0 ; k < array.length; k++){
            System.out.println("Data"+array[k]);
        }
    }
    
}
