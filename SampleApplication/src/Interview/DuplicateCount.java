/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author vamsee.n
 */
public class DuplicateCount {
    public static void main(String args []){
    int number [] =  {1,2,4,22,4,2,4,56,7,5,4,33,2,2};
    HashSet set = new HashSet();
    HashMap map = new HashMap();
    for(int i =0; i < number.length; i ++){
        System.out.println("number  "+number[i]);
        if(!map.containsKey(number[i])){
            map.put(number[i],1);
        }else{
              map.put(number[i],(int)map.get(number[i])+1);
        }
}
    System.out.println("print the map"+map);
    }
}
