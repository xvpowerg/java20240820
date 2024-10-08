/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20241001.Ch12_1_interface1;

public interface Iterator<T> {
    T get(int i);
    int size();
    default void foreach(){
        for (int i = 0; i < size(); i++){
            System.out.println(get(i));
        }
    }
}
