/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240923.Ch10_4_static_init_block3;

/**
 *
 * @author xvpow
 */
public class TestBlock {
    TestBlock(){
        System.out.println(" TestBlock()");
    }
    {
        System.out.println("Block 1");
    }
    static {
        System.out.println("static Block 1");
    }
    {
        System.out.println("Block 2");
    }
    
     static {
        System.out.println("static Block 2");
    }
}
