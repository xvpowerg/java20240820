/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_1_emum;
import  ch16_20241022.Ch16_1_emum.TestEnum.Fruits;
/**
 *
 * @author xvpow
 */
public class Ch16_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int p1 = 
      TestEnum.getFruitPrice(TestEnum.Fruits.APPLE);
       System.out.println(p1);
       
       System.out.println(TestEnum.Fruits.APPLE.getClass());
       
       System.out.println(TestEnum.Fruits.CHARRY.name());
          
       System.out.println(TestEnum.Fruits.BANANA.ordinal());
       
       Fruits ba1 =  Fruits.valueOf("BANANA");
       System.out.println(ba1);
        Fruits[] fs =  Fruits.values();
        System.out.println("====================");
        
        for (Fruits f : fs){
            System.out.println(f);
        } 
    }
    
}
