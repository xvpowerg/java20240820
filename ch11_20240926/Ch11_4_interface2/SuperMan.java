/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240926.Ch11_4_interface2;

/**
 *
 * @author xvpow
 */
public class SuperMan implements Fly,Jump,Run {
    public void flying(){
        System.out.println("SuperMan flying");
    }
    public void jumping(){
         System.out.println("SuperMan jumping");
    }
    public void runing(){
          System.out.println("SuperMan runing");
    }
}
