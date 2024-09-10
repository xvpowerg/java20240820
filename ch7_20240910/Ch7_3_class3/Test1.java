/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240910.Ch7_3_class3;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this(10,"Test1_1");
        System.out.println("Test1()");
    }
    Test1(String msg1){
        System.out.println(msg1);
        System.out.println("Test1(String msg1)");
    }
    
     Test1(int v1 , String msg1){
        this(msg1);
        System.out.println("Test1(int String)");
    }
}
