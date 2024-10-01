/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20240926.Ch11_6_interface4;

/**
 *
 * @author xvpow
 */
public interface Fly {
    int MAX_FLY_SPEED = 500;
    int MIN_FLY_SPEED = 10;
    
    int flying();
    
    public default boolean testFlySpeed(){
       int speed =  flying();
       System.out.println("speed:"+speed);
       return !(speed > MAX_FLY_SPEED || speed < MIN_FLY_SPEED);
    }
    
}
