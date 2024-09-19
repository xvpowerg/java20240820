/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240919.ch9_3_exception3;

/**
 *
 * @author xvpow
 */
public class TestException {
   void testMyException(int v)throws MyException{
       if (v > 10) throw new MyException();
   }
   void testMyRuntimeException(int v){
       if (v > 10) throw new MyRuntimeException();
   }
}
