/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20241105.Ch19_1_stream1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_1 {
    
    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList();
        listName.add("Ken");
        listName.add("Vivin");
        listName.add("Lucy");
        listName.add("Iris");
        
        for (int i = 0; i < listName.size();i++){
            String v =  listName.get(i);
            if (v.length() > 3){
                System.out.println(v);
            }            
        }
        
        listName.forEach(v->{            
            if (v.length() > 3) 
                System.out.println(v);
        });
        System.out.println("=====");
        //Stream定義一種迴圈做事情的標準
        listName.stream().filter(v->v.length() > 3).
                  forEach(v->System.out.println(v));
        
    }
    
}

