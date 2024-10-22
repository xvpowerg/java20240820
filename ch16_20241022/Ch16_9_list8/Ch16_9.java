/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_9_list8;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch16_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Item i1 = new Item("A",100);
        Item i2 = new Item("B",12);
        Item i3 = new Item("C",190);
        Item i1_copy = new Item("A",100);
        System.out.println(i1_copy.equals(i1));
        ArrayList<Item> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        System.out.println(list);
        
        list.remove(i1_copy);
         System.out.println(list);
    }
    
}
