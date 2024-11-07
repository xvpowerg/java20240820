/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20241107.Ch20_3_stream3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_3 {

    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Iris");
       list.add("Joy");
       list.add("Iris");
       list.add("Lucy");
       long count = list.stream().count();
       System.out.println(count);
       System.out.println("====================");
       list.stream().limit(3).forEach(v->System.out.println(v));
       System.out.println("====================");
       list.stream().distinct().forEach(v->System.out.println(v));
        System.out.println("====================");
        list.stream().skip(3).forEach(v->System.out.println(v));
        
        
    }
    
}
