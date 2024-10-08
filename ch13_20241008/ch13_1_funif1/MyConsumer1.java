/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20241008.ch13_1_funif1;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyConsumer1 implements Consumer<Integer> {
    public void accept(Integer v){
        System.out.println("Accept:"+v);
    }
}
