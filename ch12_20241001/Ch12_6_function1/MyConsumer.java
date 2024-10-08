/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20241001.Ch12_6_function1;

/**
 *
 * @author xvpow
 */
@FunctionalInterface
public interface MyConsumer<T> {
    //抽象的方法只有一個
    //這時可以稱這個interface是FunctionalInterface
     void accept(T data);
     
}
