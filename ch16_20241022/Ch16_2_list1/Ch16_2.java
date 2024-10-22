/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_2_list1;
import java.util.ArrayList;

public class Ch16_2 {
    public static void main(String[] args) {       
       ArrayList list = new ArrayList();
       list.add(5);
       list.add(6);
       list.add(11);
       int total = 0;
       for (int i = 0;i < list.size();i++){
           System.out.println(list.get(i));
       }
       System.out.println("==================");
       for (Object v : list){
           System.out.println(v);
       }
    }
    
}
