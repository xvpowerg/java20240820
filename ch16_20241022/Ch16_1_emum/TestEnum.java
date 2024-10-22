/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20241022.Ch16_1_emum;

/**
 *
 * @author xvpow
 */
public class TestEnum {
    
   public enum Fruits{
       APPLE,BANANA,KIWI,CHARRY
   }
    
    
   public static int getFruitPrice(Fruits f){
       if (f == null){
            throw new RuntimeException("錯誤的水果"); 
       }
       switch(f){
           case APPLE:
               return 20;
           case BANANA:
               return 10;
           case KIWI:
               return 15;
           default:
               throw new RuntimeException("錯誤的水果");
       }
   }
   
}
