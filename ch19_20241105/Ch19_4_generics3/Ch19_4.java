/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20241105.Ch19_4_generics3;
import java.util.function.Supplier;
import java.util.function.Function;
public class Ch19_4 {

    static <T> T test1(T v){
        return v;
    }
    
    static <T> T myGet(T c,Supplier<T> s){
           if (c == null){
               throw new RuntimeException("value is null");
           }
        return s.get();
    }
    
    static <T,R> R transform(T v,Function<T,R> f){        
        return f.apply(v);
    }
    public static void main(String[] args) {
        int s = test1(10);
        String name = test1("Ken");
        System.out.println(s);
        System.out.println(name);
        String value = "MyValue";
        String v = myGet(value,()->"Name:"+value +"");
        System.out.println(v);
        
        int value2 = transform("Ken",(x)->x.length());
        System.out.println(value2);
    }
    
}
