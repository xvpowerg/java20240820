/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20241029.Ch18_4_map2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken",75);
        map.put("Vivin",83);
        map.put("Lucy",94);
        map.put("Iris",65);
        
        map.merge("Vivin", 80, (v1,v2)->{
                System.out.println(v1+":"+v2);
            return (v1 + v2)/2;
        });
        System.out.println(map);
        map.merge("Joy",88, (v1,v2)->{
            System.out.println(v1+":"+v2);
                return v1+v2;
        });
             System.out.println(map);
    }
    
}
