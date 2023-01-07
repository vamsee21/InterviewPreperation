/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author vamsee.n
 */
public class SampleOne {
    
    
    public static void main(String[] args) {
        String s = "aabcccaabb";
        HashSet<String> set = new HashSet();
        HashMap<String,Integer> map = new HashMap();
        char c = s.charAt(0);
        int count = 0;
        for(int i = 0; i < s.length();i++){
            int current_count = 1;
           for(int j =i+1; j < s.length(); j++){
               
               if(s.charAt(i) != s.charAt(j)){
                   break;
               }
               current_count =current_count+1;
               System.out.println("char "+c +" count "+current_count);
           }
           if(current_count > count){
               count = current_count;
               c = s.charAt(i);
           }
        }
        System.out.println("consecutive repeat "+c);
    }
}
