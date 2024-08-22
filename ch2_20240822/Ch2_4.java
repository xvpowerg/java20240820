/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String name = new String("Ken");//參考 equals比較相等
      System.out.println(name);
      if (name.equals("Vivin") ){
          System.out.println("RD");
      }else if(name.equals("Ken")){
          System.out.println("PM");
      }else if(name.equals("Lucy")){
          System.out.println("HR");
      }else{
          System.out.println("Error");
      }
      
    }
    
}
