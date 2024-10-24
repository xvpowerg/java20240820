/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20241024.Ch17_1_set1;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch17_1 {


    public static void main(String[] args) {
       HashSet<String> set1 = new HashSet<>();
       set1.add("Ken");
       set1.add("Iris");
       set1.add("Ken");
       set1.add("Vivin");
       set1.add("Lucy");
       
       set1.forEach(v->System.out.println(v));       
       System.out.println(set1.contains("Iris"));
        System.out.println(set1.contains("Ben"));
    }
    
    
    
}
