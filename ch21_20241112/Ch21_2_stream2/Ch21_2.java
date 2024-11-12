/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20241112.Ch21_2_stream2;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> myList = new ArrayList<>();
       myList.add(75);
       myList.add(88);
       myList.add(67);
       myList.add(93);
       myList.add(85);
       myList.add(72);
       myList.add(73);
       
      Optional<Integer> op1 =  myList.stream().reduce((v1,v2)->{
           System.out.println(v1+":"+v2);
           return v1 + v2;       
       });
       System.out.println(op1.get());
       System.out.println("=====================");
       
    Integer intValue = myList.stream().reduce(10, (v1,v2)->{
           System.out.println(v1+":"+v2);
           return v1+v2;
       });
        System.out.println(intValue);
        System.out.println("=====================");
        
      Integer intValue2 =  myList.stream().parallel().reduce(15, (v1,v2)->{
            System.out.println("A1:"+v1+":"+v2);
            return v1 +v2;
        }, (v1,v2)->{
            System.out.println("A2:"+v1+":"+v2);
            return v1 + v2;
        });
       System.out.println(intValue2);
       System.out.println("=====================");
    }
    
}
