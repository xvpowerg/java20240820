/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240919.ch9_5_override_util;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
       return this.getName()+":"+
               this.getAge();
    }
    public boolean equals(Object obj){
        Student st2 = (Student)obj;
        boolean result = this.getAge() == st2.getAge() && 
                this.getName().equals(st2.getName());
        return result;
    }
}
