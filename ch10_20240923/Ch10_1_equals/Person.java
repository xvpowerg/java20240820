/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240923.Ch10_1_equals;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return this.name+":"+this.age;
    }
    
    public boolean equals(Object obj){
        if (obj instanceof Person == false){
            return false;
        }
        Person tmp =  (Person)obj;
        return this.age == tmp.age &&
                this.name.equals(this.name);
    }
}
