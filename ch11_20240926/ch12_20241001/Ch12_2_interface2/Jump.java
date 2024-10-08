/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20241001.Ch12_2_interface2;

/**
 *
 * @author xvpow
 */
public interface Jump {
    int MAX_HEIGHT = 100;
    int jumping();
    
    static boolean testJump(int height){
  
        if (height > MAX_HEIGHT){
            return false;
        }
        return true;
    }
}
