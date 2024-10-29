/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20241029.Ch18_3_map1;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken",75);
        map.put("Vivin",83);
        map.put("Lucy",94);
        map.put("Iris",65);
        System.out.println(map);
        System.out.println(map.get("Vivin"));
        if (map.containsKey("Joy")){
             System.out.println(map.get("Joy"));
        }
       
        int v1 = map.getOrDefault("Iris", -1);
        int v2 =  map.getOrDefault("Joy", -1);
        System.out.println(v1+":"+v2);
        
        map.put("Lycy", 88);//覆蓋        
        System.out.println(map.get("Lycy"));
        //如果Key存在就不呼叫put
        String key = "Joy";
        if (!map.containsKey(key)){
            map.put(key, 77);
        }
        System.out.println(map);
        
        map.putIfAbsent("Ken", 71);//不存在put
        System.out.println(map);
    }
    
}
