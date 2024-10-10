/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20241010.Ch14_6_annotation2;
import java.lang.reflect.Method;
/**
 *
 * @author xvpow
 */
public class TestClass {
    private int version = 0;
    private String value = "";
    
    {
        try{
            Method method = this.
                    getClass().getMethod("myMethod");
            
            if (method.isAnnotationPresent(MyAnnotation.class)){
               MyAnnotation annotaion = 
                       method.getAnnotation(MyAnnotation.class);
               version = annotaion.version();
               value = annotaion.value();
            }

        }catch(Exception ex){
            System.out.println(ex);
        } 
        
        
    }
    
    @MyAnnotation(value="This is my value" ,version = 2)
    public  void myMethod(){
        System.out.println("Executin myMethod...:"+value+":"+version);
    }
    
}
