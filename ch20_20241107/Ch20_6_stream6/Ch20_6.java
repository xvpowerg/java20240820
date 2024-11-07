/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20241107.Ch20_6_stream6;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch20_6 {

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
       
       Optional<String> opt1 = list.stream().findAny();
       System.out.println(opt1.get());
       Optional<String> opt2 =  list.stream().findFirst();
       System.out.println(opt2.get());
       
       Optional<String> opt3 = list.stream().parallel().findAny();
       System.out.println(opt3.get());
       Optional<String> opt4 =  list.stream().parallel().findFirst();
       System.out.println(opt4.get());
       
    }
    
}
