/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20241001.Ch12_3_interface3;

/**
 *
 * @author xvpow
 */
public class Ch12_3 {
    
    public static void main(String[] args){
        TestClass t1 = new TestClass();
        TestIF1 tif1 = t1;
        TestIF2 tif2 = t1;
        tif1.test1();
        tif2.test1();
    }
  
    
}
