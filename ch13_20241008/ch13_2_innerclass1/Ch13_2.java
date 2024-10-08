/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20241008.ch13_2_innerclass1;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch13_2 {
    
    private static class MyExceptionFunc implements Supplier<RuntimeException>{
        public RuntimeException get(){
            return new RuntimeException("MyExceptionFunc!!!");
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student("Ken");
        st1.setAge(18);
        System.out.println(st1);
//        
//        Student st2 = new Student("Lucy");
//        st2.setExceptionFUnc(new MyExceptionFunc());
//        st2.setAge(180);
//        System.out.println(st2);

//default Exception
//        Student st3 = new Student("Iris");
//        st3.setAge(200);
//        System.out.println(st3);

          Student st4 = new Student("Joy");
          st4.setExceptionFUnc(new Supplier<RuntimeException>(){
          
              public RuntimeException get(){
                  return new RuntimeException("匿名類例外!");
              }
          
          });
          st4.setAge(150);
          
    }
    
}
