/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20241010.Ch14_6_annotation2;
import java.lang.reflect.Method;
/**
 *
 * @author xvpow
 */
public class Ch14_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
       Method method =  TestClass.class.getMethod("myMethod");
       
       if (method.isAnnotationPresent(MyAnnotation.class)){
          MyAnnotation an = method.getAnnotation(MyAnnotation.class);
          System.out.println("an value:"+an.value());
          System.out.println("an Version:"+an.version());
       }
       
    }
    
}
