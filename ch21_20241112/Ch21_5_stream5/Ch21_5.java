/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20241112.Ch21_5_stream5;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch21_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it1 = new Item(100,"A1");
        Item it2 = new Item(25,"A2");
        Item it3 = new Item(18,"A3");
        Item it4 = new Item(95,"A1");
        
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(it1);
        itemList.add(it2);
        itemList.add(it3);
        itemList.add(it4);
        System.out.println(itemList);
        
      Map<String,Integer> map = 
                    itemList.stream().collect(Collectors.toMap(it->it.getName(), 
                it->it.getPrice(),(v1,v2)->{
                    System.out.println(v1+":"+v2);
                    return v1+v2;
                }));
      
      System.out.println(map);
    }
    
}
