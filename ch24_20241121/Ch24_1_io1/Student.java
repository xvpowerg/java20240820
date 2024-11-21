/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20241121.Ch24_1_io1;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Student implements Serializable{
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return this.name +":"+this.age;
    }
}
