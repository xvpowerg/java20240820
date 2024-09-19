/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240919.ch9_3_exception3;

/**
 *
 * @author xvpow
 */
public class Ch9_3 {
    
    public static void main(String[] args) {
      TestException te = new TestException();
      try{
           te.testMyException(11);
      }catch(MyException ex){
          System.out.println(ex);
      }
      
     try{
          te.testMyRuntimeException(11);  
     }catch(MyRuntimeException ex){
         System.out.println(ex);
     }
       
      
     
    }
    
}
