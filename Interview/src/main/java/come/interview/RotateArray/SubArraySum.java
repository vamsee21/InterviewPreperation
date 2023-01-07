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
public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int expectedSum = 23;
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum = arr[i];
            if(currentSum == expectedSum){
                System.out.println("Sum found at index "+i);
            }else{
                for(int j = i+1; j < arr.length; j++){
                    currentSum += arr[j];
                    if(currentSum == expectedSum){
                System.out.println("Sum found at index "+i +"     "+ j);
                return;
            }
                }
            }
        }
        
        System.out.println("Sum not found the in the sub array");
    }
}
