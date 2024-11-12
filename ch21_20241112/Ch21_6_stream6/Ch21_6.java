/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20241112.Ch21_6_stream6;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch21_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it1 = new Item(100,"A1");
        Item it2 = new Item(25,"A2");
        Item it3 = new Item(18,"A3");
        Item it4 = new Item(95,"A1");
        Item it5 = new Item(97,"A1");
        Item it6 = new Item(98,"A2");
        Item it7 = new Item(98,"A3");
        
        
        
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(it1);
        itemList.add(it2);
        itemList.add(it3);
        itemList.add(it4);
        itemList.add(it5);
        itemList.add(it6);
        itemList.add(it7);
        System.out.println(itemList);
        
        Map<String,List<Item>> groupItem 
                = itemList.stream().
                        collect(Collectors.groupingBy(it->it.getName()));
   
        System.out.println(groupItem);
        
      Map<String,Long>  groupItem2 =  itemList.stream().
                        collect(Collectors.groupingBy(it->it.getName(),
                                Collectors.counting()));
        System.out.println(groupItem2);
        
      Map<Boolean,List<Item>> pGroup =  
              itemList.stream().collect(Collectors.partitioningBy(p->p.getPrice() > 90));
      System.out.println(pGroup);
      
      
    }
    
}
