/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20241121.Ch24_2_io2;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Student extends Person implements Serializable{
    //控制序列化版本
    public static final long serialVersionUID = 43L;
    private String name;
    private int age;
    
    Student(String name,int age,int height,float weight){
        super(height,weight);
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return this.name +":"+this.age+":"+super.toString();
    }
}