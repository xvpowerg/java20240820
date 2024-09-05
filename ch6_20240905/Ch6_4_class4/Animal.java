/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20240905.Ch6_4_class4;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String  name;
    private int age;
    private float height;
    Animal(){}
   
    Animal(String myName,int myAge,float myHeight){
        name = myName;
        age = myAge;
        height = myHeight;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String myName){
        name = myName;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int myAge){
        age = myAge;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float myHeight){
        height = myHeight;
    }
    
    void printInfo(){
        System.out.println(name+":"+age+":"+height);
    }
}
