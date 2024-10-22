/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_8_list7;

import java.util.LinkedList;

/**
 *
 * @author xvpow
 */
public class Ch16_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>();
      list.add("Ken");
      list.add("Iris");
      list.add("Lucy");
      list.add("Joy");      
      list.addFirst("Gigi");
      list.addLast("Sean");
      System.out.println(list);
      //利用pop全部輸出
//      while(list.size() > 0){
//          System.out.println(list.pop());
//      }

        try{
             while(true){
                  System.out.println(list.pop());
              }
        }catch(Exception ex){

        }
   
      
    }
    
}
