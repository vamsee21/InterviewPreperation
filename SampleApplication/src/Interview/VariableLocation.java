/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

import java.io.IOException;

/**
 *
 * @author vamsee.n
 */
public strictfp  class VariableLocation {
    private int a = 0;
    protected static final int b = 20;
    protected int c = 30;
    
    public VariableLocation()throws IOException{
        System.out.println("constructor  "+c+"   "+a);
    }
    
    {
        System.out.println("Variable Location  "+c+"    "+a);
    }
    
    public static void main(String[] args) throws IOException {
        final int z = 0;
        System.out.println("variable value before"+ "   "+b+"   ");
        VariableLocation location = new VariableLocation();
        System.out.println("variable value after "+ "   "+b+"   ");
    }
    
    static{
        System.out.println("I am static block");
    }
    public  int m1(int i) throws IOException{
        System.out.println("call from m1 method");
        return 1;
    }
    
}
