/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240910.Ch7_5_class5;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this(10,"X1");
        System.out.println("Test1()");
    }
    
    Test1(String msg){
       System.out.println("Test1(String msg)");
    }
    
    Test1(int v1,String msg){
        this(msg);
         System.out.println("Test1(int v1,String msg");
    }
}
