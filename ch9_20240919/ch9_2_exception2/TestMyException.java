/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240919.ch9_2_exception2;

/**
 *
 * @author xvpow
 */
public class TestMyException {
    public void runException(boolean isEx)
            throws MyException1,MyException3{
        if (isEx){
            throw new MyException1();
        }else{
          throw new MyException3();  
        }
    }
    
    public void runException2(boolean isEx)
                throws MyException2,MyException1{
        if (isEx){
            throw new MyException2();
        }else{
           throw new MyException1();  
        }
    }
}
