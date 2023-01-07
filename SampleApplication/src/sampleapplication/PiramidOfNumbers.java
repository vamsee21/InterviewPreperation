/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;

/**
 *
 * @author vamsee.n
 */
public class PiramidOfNumbers {
    public static void pattern1(int noRows) {

		int rowCount = 1;
		System.out.println("Here Is Your Pyramid pattern 1");
		for (int i = noRows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount + " ");
			}
			System.out.println();
			rowCount++;
		}

	}
    
    public static void main(String args []){
        pattern1(5);
    }
}
