/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240912.Ch8_6_exception2;

/**
 *
 * @author xvpow
 */
public class Ch8_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestException tex  = new TestException();
        try{
            tex.testException1(true);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
               tex.testRuntimeException(true);
        }catch(RuntimeException ex){
             System.out.println(ex);
        }
     
        
        try{
            tex.testException1(false);
            tex.testRuntimeException(true);
        }catch(RuntimeException ex){
            System.out.println(ex);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        
    }
    
}
