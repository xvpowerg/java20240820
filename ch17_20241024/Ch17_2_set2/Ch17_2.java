/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20241024.Ch17_2_set2;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Item i1 = new Item("A",20);
      Item i2 = new Item("B",26);
      Item i3 = new Item("C",31);
      Item i4 = new Item("D",56);
      Item i5 = new Item("E",63);
      Item i6 = new Item("A",20);
      
      System.out.println(i6.equals(i1));
      HashSet<Item> set1 = new HashSet();
      
      set1.add(i1);
      set1.add(i2);
      set1.add(i3);
      set1.add(i4);
      set1.add(i5);
      set1.add(i6);
      
      set1.forEach(v->System.out.println(v));
      
    }
    
}
