/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20241107.Ch20_7_stream7;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_7 {

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
       list.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
       //找出所有字串長度大於3的 並且找出所有字串的長度 顯示
       list.stream().filter(n->n.length() > 3).
               map(n->n.length()).forEach(len->System.out.println(len));
    }
    
}
