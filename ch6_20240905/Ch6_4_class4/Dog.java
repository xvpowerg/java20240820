/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20240905.Ch6_4_class4;

/**
 *
 * @author xvpow
 */
public class Dog extends Animal{
    Dog(){
        
    }
    Dog(String myName,int myAge,float myHeight){
//        setName(myName);
//        setAge(myAge);
//        setHeight(myHeight);
//呼叫父類別(Animal)建構式
        super(myName,myAge,myHeight);
    }
    
    //複寫 Overrid
    void printInfo(){
        System.out.print("Dog:");
        //呼叫父類別的方法
        super.printInfo();
    }
}
