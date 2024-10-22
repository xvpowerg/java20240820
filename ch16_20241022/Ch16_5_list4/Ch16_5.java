/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_5_list4;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch16_5 {

    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(19);
        list.add(11);
        System.out.println(list);
        
        ArrayList<Integer> data = new ArrayList();
        data.add(25);
        data.add(27);
        list.addAll(data);
        System.out.println(list);
        
        list.add(2, 110);
        System.out.println(list);
        ArrayList<Integer>data2 = new ArrayList();
        data2.add(120);
        data2.add(122);
        data2.add(123);
        list.addAll(1, data2);
        System.out.println(list);
        
        list.remove(Integer.valueOf(110));
        System.out.println(list);
        
        ArrayList<Integer> data3 = new ArrayList<>();
        data3.add(120);
        data3.add(123);
        list.removeAll(data3);
        System.out.println(list);
        
        
        list.removeIf(v->v <= 11);
         System.out.println(list);
        list.replaceAll(v->v+3);
        System.out.println(list);
        
        list.set(3, 27);
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
    
}
