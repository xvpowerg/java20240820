/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20241105.Ch19_2_generics1;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList <T>list;
    MyList(){
      list = new ArrayList();  
    }
    public void add(T v){
       list.add(v);
    }
    public T get(int index){
        return list.get(index);
    }
    public void foreach(Consumer<T> style){
        list.forEach(style);
    }
}
