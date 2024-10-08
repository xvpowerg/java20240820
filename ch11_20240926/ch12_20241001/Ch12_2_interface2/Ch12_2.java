/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20241001.Ch12_2_interface2;

/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        int h1 = cat1.jumping();
        System.out.println(Jump.testJump(h1));
    }
    
}
