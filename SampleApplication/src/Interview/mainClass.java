/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

/**
 *
 * @author vamsee.n
 */
public class mainClass implements Interface1,Interface2 {
     int i;
    
     public int m1(){
         System.out.println("main class ");
         return 1;
     }
     
    public mainClass(int i, int y){
        i = 10;
    }
    public static void main(String[] args) {
//        VariableLocation vl = new VariableLocation();
//        VariableLocation vl1   = new VariableLocation1();
//        VariableLocation1 vl2 = new VariableLocation1();
//        
//        //VariableLocation vl11   = new Sample.VariableLocation1();
//      
//        vl.m1();
//        vl1.m1();
//        vl2.m1();
        
        System.out.println(" main class  "+Interface1.a);
        
        
    }

    public void m1(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
