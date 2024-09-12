/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240912.Ch8_6_exception2;

/**
 *
 * @author xvpow
 */
public class TestException {
    public void testException1(boolean b1)throws Exception{
        if (b1){
            throw new Exception();
        }
    }
    
    public void testRuntimeException(boolean b1){
        if (b1){
            throw new RuntimeException();
        }
    }
}
