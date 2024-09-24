/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240923.Ch10_3_static_init_block2;

/**
 *
 * @author xvpow
 */
public class TestStaticBlock {
   private  static String[] strArray = new String[100];
   static{
       for(int i =0; i < strArray.length;i++){
           strArray[i] = "Empty";
       }
   
   }
   public static String getMsg(int i){
       return strArray[i];
   }

}
