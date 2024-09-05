/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20240905.Ch6_4_class4;

/**
 *
 * @author xvpow
 */
public class Cat extends Animal {
    Cat(){
    
    }
    Cat(String myName,int myAge, float myHeight){
        super(myName,myAge,myHeight);
    }
    
    void printInfo(){
        System.out.print("Cat:");
        super.printInfo();
    }
}
