/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author vamsee.n
 */
public class VariableLocation1 extends VariableLocation{

    
    public VariableLocation1() throws Throwable{
        
    }
    
    @Override
    public int m1(int i) throws FileNotFoundException{
        System.out.println(" method m1 from child class");
        return 1;
    }
    
}
