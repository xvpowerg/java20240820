/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20241001.Ch12_4_interface4;

/**
 *
 * @author xvpow
 */
public interface TestIF2 extends TestIF1 {
       default void testDefault(){
        System.out.println("TestIF2");
    }
}
