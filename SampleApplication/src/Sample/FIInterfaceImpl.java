/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

public class FIInterfaceImpl implements FIInterface {

    @Override
    public void method1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void method3() {
        System.out.println("method 3");
    }
    
    @Override
    default void method2(){
        System.out.println("mehtod 2 from child");
    }

    void mehtod5(){
        System.out.println("method 5");
    }
}
