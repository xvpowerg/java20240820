/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20241010.Ch14_1_methodrf1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch14_1 {

    static ArrayList<String> runTestIfList(TestIF tif,
            ArrayList<String> list){
        ArrayList<String> newList =  tif.test(list);
        return newList;
    }
    
    static ArrayList testIfFunc(ArrayList<String> data){
        ArrayList <String> newList = new ArrayList<>();
        for (String d : data){
           newList.add(d.toLowerCase()) ;
        }
        return newList;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> data = new ArrayList<>();
        data.add("Ken");
        data.add("Vivin");
        data.add("Lucy");
        
      ArrayList<String> uppperList =  runTestIfList(dataList ->{
            ArrayList<String> newList = new ArrayList();
            for (String v : dataList){
                newList.add(v.toUpperCase());
            }
            return newList;
        },data);
        
      System.out.println(uppperList);
      
     ArrayList<String> lowerList =   runTestIfList(Ch14_1::testIfFunc,data);
     System.out.println(lowerList);
        
    }
    
}
