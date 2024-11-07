/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20241107.Ch20_4_stream4;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_4 {

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
       
       boolean b1 = list.stream().allMatch(n->n.length() > 2);
       System.out.println(b1);
       boolean b2 =  list.stream().anyMatch(n->n.length() > 3);
        System.out.println(b2);       
       boolean b3 =   list.stream().noneMatch(n->n.length() < 2);
       System.out.println(b3);   
       
       
       boolean b4 = list.stream().allMatch(n->n.length() < 2);
       boolean b5 = list.stream().anyMatch(n->n.length() > 9);
       boolean b6 = list.stream().noneMatch(n->n.length() >3);
       System.out.println(b4);
       System.out.println(b5);
       System.out.println(b6);
       //false
       //false
       //false
       
    }
    
}
