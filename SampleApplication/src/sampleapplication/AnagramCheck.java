/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;

import java.util.Arrays;

public class AnagramCheck {

	public static void checkAnagram(String one,String two){
		String copiedOfS1 =one.replaceAll("\\s+", "");
		String copiedOfS2 = two.replaceAll("\\s+", "");
		
		boolean status =true;
		
		if(copiedOfS1.length() != copiedOfS2.length()){
			status = false;
		}else{
			char[] array = copiedOfS1.toLowerCase().toCharArray();
			char[] array1 = copiedOfS2.toLowerCase().toCharArray();
			Arrays.sort(array);
                        Arrays.sort(array1);
                        System.out.println("array   "+array.length);
                        System.out.println("array1 "+ array1.length);
                       
		
                        status = Arrays.equals(array, array1);
		}
                if(status){
                    System.out.println("array  array1 are anagrams");
                }else{
                    System.out.println("array array1 are not anagrams");
                }
		
		
		//return status;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
            
            try{
                int a = 5/1;
                throw new RuntimeException();
               // System.out.println("try");
            }
            
            catch(RuntimeException ex){
                System.out.println("catch child");
            }
            catch(Exception ex){
                System.out.println("catch parent");
            }
            catch(Throwable t){
                
            }
            finally{
                System.out.println("finally");
            }
            System.out.println("null pointer exception");
            AnagramCheck check = new AnagramCheck();
            check.checkAnagram("Silent", "listen");

	}

}
