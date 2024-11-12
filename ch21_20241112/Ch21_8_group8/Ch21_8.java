/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20241112.Ch21_8_group8;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch21_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it1 = new Item(100,"A1");
        Item it2 = new Item(25,"A2");
        Item it3 = new Item(18,"A3");
        Item it4 = new Item(95,"A4");
        Item it5 = new Item(95,"A1");
        Item it6 = new Item(95,"A3");
        Item it7 = new Item(96,"A7");
        Item it8 = new Item(96,"A2");
        
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(it1);
        itemList.add(it2);
        itemList.add(it3);
        itemList.add(it4);
        itemList.add(it5);
        itemList.add(it6);
        itemList.add(it7);
        itemList.add(it8);
        
        HashMap<String,ArrayList<Item>> groupMap = new HashMap();
        
        
        for (Item it : itemList){
            groupMap.computeIfPresent(it.getName(), (k,v2)->{
                    v2.add(it);                
                return v2;});
            
            groupMap.computeIfAbsent(it.getName(), (k)->{
                ArrayList<Item> dataList = new ArrayList();
                dataList.add(it);
            return  dataList;
            });
        }
        
        System.out.println(groupMap);
        
        
    }
    
}
