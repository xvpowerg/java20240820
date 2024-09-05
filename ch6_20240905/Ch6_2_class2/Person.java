/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20240905.Ch6_2_class2;

/**
 *
 * @author xvpow
 */
public class Person {
    //預設建構式
    Person(){
        
    }
    Person(String myName,int myAge){
        name = myName;
        age = myAge;
    }
    String name;
    int age;
    void printInfo(){
        System.out.println(name+":"+age);
    }
}
