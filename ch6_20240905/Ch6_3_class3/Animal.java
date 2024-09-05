/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20240905.Ch6_3_class3;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private int age;
    public void setAge(int myAge){
        if (myAge < 0 || myAge > 200){
            System.out.println("錯誤的年齡!");
            return;
        }
        age = myAge;
    }
    public int getAge(){
        return age;
    }
    
    public void setName(String myName){
        if (myName == null || myName.length() == 0 ){
            System.out.println("錯誤的姓名");
            name = "Empty";
            return;
        }
        name = myName;
    }
    public String getName(){
        return name;
    }
    
    void printInfo(){
        System.out.println(name+":"+getAge());
    }
}
