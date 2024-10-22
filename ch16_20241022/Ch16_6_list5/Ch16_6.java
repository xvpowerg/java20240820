/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_6_list5;
import java.util.LinkedList;
public class Ch16_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        
        for (String name : list){
            System.out.println(name);
        }
        
        
        
    }
    
}
