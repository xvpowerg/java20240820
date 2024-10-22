/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_3_list2;
import java.util.ArrayList;

public class Ch16_3 {

    public static void main(String[] args) {
        
        ArrayList <Integer> myPrice = new ArrayList();
        myPrice.add(25);
        myPrice.add(73);
        myPrice.add(12);
        int total = 0;
        for (int v : myPrice){
            total += v;
        }
        System.out.println(total);
         System.out.println("===================");
        myPrice.forEach(v->System.out.println(v));
    }
    
}
