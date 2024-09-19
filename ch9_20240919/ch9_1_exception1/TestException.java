/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240919.ch9_1_exception1;

/**
 *
 * @author xvpow
 */
public class TestException {
    public void testException(boolean isEx)throws Exception{
        if (isEx){
            throw new Exception("測試例外1");
        }
    }
    
    public void close(){
        System.out.println("清除資源");
    }
}
