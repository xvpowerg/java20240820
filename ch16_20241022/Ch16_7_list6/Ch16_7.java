/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_7_list6;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch16_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<>();
      list.add("Ken");
      list.add("Iris");
      list.add("Lucy");
      list.add("Joy");
      
      list.addFirst("Gigi");
      list.addLast("Sean");
      System.out.println(list);
      
      list.offer("Yumi");
      list.offerFirst("Tom");
      System.out.println(list);
      
      System.out.println(list.peek());
      System.out.println(list.peek());
      System.out.println(list);
      System.out.println(list.pop());
      System.out.println(list);
      System.out.println(list.pop());
      System.out.println(list);
      
      
    }
    
}
