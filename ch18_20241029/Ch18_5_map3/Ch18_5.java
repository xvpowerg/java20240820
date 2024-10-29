/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20241029.Ch18_5_map3;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch18_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken",75);
        map.put("Vivin",83);
        map.put("Lucy",94);
        map.put("Iris",65);
         //Key存在
//         map.compute("Ken", (k,v)->{
//                        System.out.println(k+":"+v);
//                return v+10;
//         });
//         System.out.println(map);
//         
//        map.computeIfAbsent("Ken", (k)->{System.out.println(k);//不執行因為key存在
//        return 10;
//        });
//        
//        map.computeIfPresent("Iris", (k,v)->{            
//            System.out.println(k+":"+v);
//            return v+5;            
//        });
          //Key不存在
          map.compute("Joy", (k,v)->{          
              System.out.println(k+":"+v);
              return 78;          
          });
          
          map.computeIfAbsent("Nono", (k)->{                
              System.out.println(k);
              return 92;
          });
          map.computeIfPresent("Yumi", (k,v)->{//不執行因為key不存在
          
          System.out.println(k+":"+v);
          return v;
          });
        System.out.println(map);
    }
    
}
