/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240912.Ch8_1_modifider1;

/**
 *
 * @author xvpow
 */
public class Test4 {
    private Test4(){
        System.out.println("private Test4()");
    }
    
    public static Test4 newTest4(){
        return new Test4();
    }
}
