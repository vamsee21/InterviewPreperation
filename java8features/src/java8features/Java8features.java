/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author vamsee.n
 */
public class Java8features {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        List<String> list = new ArrayList();
        list.add("rakuten");
        list.add("mufg");
        list.add("smbc");
        list.add("mizhuo");

        String key ="rakutenBank|rakutenBank";
        boolean res = list.stream().anyMatch((s) -> s.contains(key));
        
        System.out.println("result  "+res);
        
        
        Function<Integer,Double> square;
        square = new Function<Integer, java.lang.Double>() {

            public java.lang.Double apply(Integer i) {
                return new Double(i*i);
            }
        };
        System.out.println("square of the value i "+square.apply(5));
        
        
        Consumer<String> consumer = s -> System.out.println("display  "+s);
        
        list.forEach(consumer);
        
        
    }

    private static Function<Integer, Double> Double(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
