/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20241107.Ch20_5_stream5;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Iris");
       list.add("Joy");
       
     boolean b1 =   list.stream().peek(n->System.out.println(n)).allMatch(n->n.length() > 2);
     System.out.println(b1);
     System.out.println("==============");
      boolean b2 = list.stream().peek(n->System.out.println(n)).allMatch(n->n.length() > 4);
       System.out.println(b2);
            System.out.println("======anyMatch========");
      boolean b3 =  list.stream().peek(n->System.out.println(n)).anyMatch(n->n.length() > 3);
           System.out.println(b3);
             System.out.println("======anyMatch========");
      boolean b4 =  list.stream().peek(n->System.out.println(n)).anyMatch(n->n.length() < 3);             
      System.out.println(b4);
      
       System.out.println("======noneMatch========");
      boolean b5 = 
              list.stream().peek(n->System.out.println(n)).noneMatch(n->n.length() > 3);          
      System.out.println(b5);
            System.out.println("======noneMatch========");
      boolean b6 = 
              list.stream().peek(n->System.out.println(n)).noneMatch(n->n.length() < 2);          
      System.out.println(b6);
    }
    
}
