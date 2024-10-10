/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20241010.Ch14_6_annotation2;

/**
 *
 * @author xvpow
 */
public class TestClass2 extends TestClass {
    @MyAnnotation(value="This is my value X" ,
            version = 3)
    public void myMethod(){
        super.myMethod();
    }
}
