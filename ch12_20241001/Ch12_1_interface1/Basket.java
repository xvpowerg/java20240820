/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20241001.Ch12_1_interface1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Basket implements Iterator<Item> {
    private ArrayList<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    
    public int size(){
        return items.size();
    }
    
   public Item get(int i){
       return items.get(i);
   }
}
