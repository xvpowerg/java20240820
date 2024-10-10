/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20241010.Ch14_2_methodrf2;

/**
 *
 * @author xvpow
 */
public class MyClass {
    public void testMyIF2(int v){
        v += 25;
        System.out.println("MyRef:"+v);
    }
    public void runTestIF2(TestIF2 tif2,int data){
        tif2.testIF2(data);
    }
    
    public void testRun(){
        runTestIF2(this::testMyIF2,12);
    }
}
