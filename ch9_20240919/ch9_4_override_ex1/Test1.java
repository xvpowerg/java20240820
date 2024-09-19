/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240919.ch9_4_override_ex1;

/**
 *
 * @author xvpow
 */
public class Test1 {
   public void testMethod1(int v1)throws MyException{
       if (v1 >= 10){
           throw new MyException();
       }
   }
}
