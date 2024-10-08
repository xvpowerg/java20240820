/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20241001.Ch12_6_function1;

public interface Iterator<T> {
    T get(int i);
    int size();
    default void foreach(MyConsumer<T> com){
        for (int i = 0; i < size(); i++){
           com.accept(get(i));
        }
    }
}
