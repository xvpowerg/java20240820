/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20241024.Ch17_3_set3;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch17_3 {

    public static void main(String[] args) {
      //18 23 15 6 25 31 11
      TreeSet<Integer> tree = new TreeSet();
      tree.add(18);
      tree.add(23);
      tree.add(15);
      tree.add(6);
      tree.add(25);
      tree.add(31);
      tree.add(11);
      
      tree.forEach(v->System.out.println(v));
      
      System.out.println("=================");
      
       System.out.println(tree.ceiling(19));//>=
       System.out.println(tree.higher(19));//>
      System.out.println("================="); 
       System.out.println(tree.ceiling(23));//>=
       System.out.println(tree.higher(23));//>
      System.out.println("================="); 
      System.out.println(tree.floor(14));//<=
      System.out.println(tree.lower(14));//<
      System.out.println("=================");            
      System.out.println(tree.floor(15));//<=
      System.out.println(tree.lower(15));//<
      System.out.println("================="); 
      
      System.out.println(tree.first());
      System.out.println(tree.last());
      
    }
    
}
