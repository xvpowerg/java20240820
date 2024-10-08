/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20241001.Ch12_6_function1;

/**
 *
 * @author xvpow
 */
public class PrintSrudentScore implements MyConsumer<Integer>{
    
    public void accept(Integer score){
        System.out.println("Student:"+score);
    }
}
