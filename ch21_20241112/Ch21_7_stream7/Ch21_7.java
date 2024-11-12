/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20241112.Ch21_7_stream7;
import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch21_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it1 = new Item(100,"A1");
        Item it2 = new Item(25,"A2");
        Item it3 = new Item(18,"A3");
        Item it4 = new Item(95,"A4");
        Item it5 = new Item(95,"A1");
        Item it6 = new Item(95,"A3");
        Item it7 = new Item(96,"A7");
        Item it8 = new Item(96,"A2");
        
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(it1);
        itemList.add(it2);
        itemList.add(it3);
        itemList.add(it4);
        itemList.add(it5);
        itemList.add(it6);
        itemList.add(it7);
        itemList.add(it8);
        itemList.stream().map(it->it.getName()).distinct().
                forEach(v->System.out.println(v));
        //System.out.println(itemList);
        
          String msg = itemList.stream().map(it->it.getName()).distinct().
                  collect(Collectors.joining(",", "Titile:", "."));
          System.out.println(msg);
          
    }
    
}
