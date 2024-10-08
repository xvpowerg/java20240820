/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20241008.ch13_1_funif1;
import java.util.function.Consumer;
import java.util.function.Supplier;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import java.util.function.Predicate;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch13_1 {

    static void randomNumber(Consumer<Integer> func){
        Random ran = new Random();
        int v = ran.nextInt(1000);
        func.accept(v);
    }
    public static void main(String[] args) {
       MyConsumer1 mc1 = new MyConsumer1();
       randomNumber(mc1);
        
        
    }
    
}
