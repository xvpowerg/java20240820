/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20241112.Ch21_3_stream3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch21_3 {

    public static void main(String[] args) {
      ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ken");
        nameList.add("Vivin");
        nameList.add("Lincy");
        nameList.add("Joy");
        nameList.add("Gigi");
        nameList.add("Tom");
     List<String>  myNameList = 
             nameList.stream().filter(n->n.length() > 3).collect(Collectors.toList());
        
     System.out.println(myNameList);
    ArrayList<String> nyNameList2 =   nameList.stream().filter(n->n.length() > 4).
            collect(Collectors.
             toCollection(ArrayList::new));
    System.out.println(nyNameList2);
    
    
    }
    
}
