/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20241008.ch13_2_innerclass1;
import java.util.function.Supplier;

public class Student {
    private int age;
    private String name;
    private Supplier<RuntimeException> exFunc;
    
    private class DefaultExcFunc implements 
            Supplier<RuntimeException>{
        public RuntimeException get(){
            return new RuntimeException("Default Ex");
        }
    }
    
    public Student(String name){
        this.name = name;
        this.exFunc = new DefaultExcFunc();
    }
    public void setExceptionFUnc(
            Supplier<RuntimeException> exFunc){
        this.exFunc  = exFunc;
    }
    
    public void setAge(int age)throws RuntimeException{
        if (exFunc != null && (age < 0 || age > 120) ){
            throw exFunc.get();
        }
        this.age = age;
    }
    
    public String toString(){
        return name+":"+this.age;
    }
}
