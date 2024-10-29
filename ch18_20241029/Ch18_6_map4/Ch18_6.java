/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20241029.Ch18_6_map4;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch18_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Item item1 = new Item("A1",100);
        Item item2 = new Item("A2",72);
        Item item3 = new Item("A1",93);
        Item item4 = new Item("A2",66);
        Item item5 = new Item("A1",92);
        Item item6 = new Item("A3",85);
        
        
        ArrayList<Item> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item6);
        //list.forEach(it->System.out.println(it));
        
        //list.add(e)
        //A1 100 
        HashMap<String,ArrayList<Item>> group = new HashMap<>();
        
        for (Item it :  list){
            ArrayList<Item> tmplist = new ArrayList();
            if (group.containsKey(it.getName())){
                tmplist = group.get(it.getName());
            }
            tmplist.add(it);
            group.put(it.getName(), tmplist);
        }        
        System.out.println(group);        
        //group.merge 該如何寫
        
        
        group.forEach((k,v)->System.out.println(k+":"+v));
        //group.computeIfAbsent(key, mappingFunction)
        //group.computeIfPresent(key, remappingFunction)
    }
    
}
