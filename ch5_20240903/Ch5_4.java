/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240903;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    /*
     多載的順序
    1 相同類型
    2 相同類型可相容
    3 不同類型可相容
    4 封箱類型    
    */
    public static void main(String[] args) {
       //封箱類型 就是將基本型態轉物件
       /* byte     Byte
          short    Short
          int      Integer
          long     Long
          
          float    Float
          double   Double 
       
          char     Character
       
          boolean  Boolean
       */
       
       //Boxing 封箱
       Integer intObj = Integer.valueOf(56);
       
      //unBoxing 解封箱
      int v1 = intObj.intValue();
      System.out.println(v1);
      
      
      //自動封箱
      Integer intObj2 = 18;
      //自動解封箱
      int v2 = intObj2;
      System.out.println(v2);
      

     Integer intObj3 = null;
     System.out.println(intObj3);
      int v3 = intObj3;//java.lang.NullPointerException
       System.out.println(v3);
    }
    
}
