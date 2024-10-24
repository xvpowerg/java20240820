/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20241024.Ch17_4_set4;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch17_4 {

 
    public static void main(String[] args) {
        Item it1 = new Item(25);
        Item it2 = new Item(18);
        Item it3 = new Item(17);
        Item it4 = new Item(5);
        TreeSet<Item> set1 = new TreeSet();
        
        set1.add(it1);
        set1.add(it2);
        set1.add(it3);
        set1.add(it4);
        
        set1.forEach(v->System.out.println(v));
    }
    
}
