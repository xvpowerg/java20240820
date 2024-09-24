/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240923.Ch10_5_static1;

/**
 *
 * @author xvpow
 */
public class Student {
    private static String name;
    private int age;
    
    public void setName(String name){
        Student.name = name;
    }
    
    public void setAag(int age){
        this.age = age;
    }
    
    public String toString(){
        return name+":"+age;
    }
}
