/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240919.ch9_2_exception2;
import java.io.IOException;
import java.io.FileNotFoundException;
//FileNotFoundException 繼承了 IOException
public class Ch9_2 {
    static void testIOException(boolean isEx)throws FileNotFoundException,IOException{
        if (isEx){
           throw new FileNotFoundException();
        }else{
           throw new IOException();
        }
    }
    
    public static void main(String[] args) {
        
        try{
            testIOException(true);
        }catch(FileNotFoundException ex1){
            System.out.println(ex1);
        }catch(IOException ex2){
            System.out.println(ex2);
        }
        
        
        TestMyException ex = new TestMyException();
        try{
            ex.runException(false);
        }catch(MyException1 ex1){
            System.out.println(ex1);
        }catch(MyException3 ex3){
             System.out.println(ex3);
        }
        
        //只有無繼承關係的例外才可寫成|
        try{
            ex.runException(false);
        }catch(MyException1 | MyException3 ex1){
            System.out.println(ex1);
        }
        
        //越下越父
        try{
           ex.runException2(false);
        }catch(MyException2 ex2){
            System.out.println(ex2);
        }catch(MyException1 ex1){
             System.out.println(ex1);
        }
     
        
        
      
    }
    
}
