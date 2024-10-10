/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20241010.Ch14_3_methodrf3;
import java.util.function.Function;

public class Ch14_3 {

    
    static MyClass stringToMyClass(Function<String,MyClass> func,String v){
        return func.apply(v);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass c1 = stringToMyClass(MyClass::new,"Ken");
        System.out.println(c1);
    }
    
}
