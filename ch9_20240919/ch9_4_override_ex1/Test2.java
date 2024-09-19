/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240919.ch9_4_override_ex1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
//       public void testMethod1(int v1)throws MyException{
//       if (v1 >= 10){
//           System.out.println("Test2");
//           throw new MyException();
//       }
//   }
    
//    public void testMethod1(int v1)throws MyException2{
//       if (v1 >= 10){
//           System.out.println("Test2");
//           throw new MyException2();
//       }
//   }
    
      public void testMethod1(int v1)throws MyRuntimeException{
       if (v1 >= 10){
           System.out.println("Test2");
           throw new MyRuntimeException();
       }
   }
}
