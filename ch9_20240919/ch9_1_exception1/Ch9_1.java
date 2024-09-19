/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240919.ch9_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    static int testFinally(int v){
        try{
          if (v >= 10){
              return 5;
          }
          return 7;
        }finally{
            System.out.println("Test finally");
        }
        
    }
    public static void main(String[] args) {
        
     testFinally(2);
     testFinally(26);  
     TestException t1 = null;
       try{
           t1 = 
              new TestException();
           t1.testException(true);
          
       }catch(Exception ex){
           System.out.println(ex);
       }finally{
            t1.close();
       }
     
        
    }
    
}
