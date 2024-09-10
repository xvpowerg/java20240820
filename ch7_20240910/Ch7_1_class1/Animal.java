/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240910.Ch7_1_class1;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private int age;
    Animal(){
//        this.name = "Empty";
//        this.age = -1;    
       this("Empty",-1);//可以呼叫其他建構式
    }
    //this. 表示當前物件
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    
    public void printInfo(){
        System.out.println(getName()+":"+getAge());
    }
}
