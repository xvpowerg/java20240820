/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240829;

/**
 *
 * @author xvpow
 */
public class Ch4_6 {
     //call by value
    //所有基本型態都是 call by value
    //只要是基本型態傳入的數值修改不影響原始資料
    static void testCallByValue(int a,int b){
       int tmp = a;
       a = b;
       b = tmp;       
    }
    //call by reference
    //不是基本型態就是參考型態
    //只要是參考型態傳入的數值可能修改原始資料
    static void testCallByRef(int[] array){
         int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp; 
    }
    public static void main(String[] args) {
       int a = 10,b = 20;
       System.out.println(a+":"+b);
      testCallByValue(a,b);
       System.out.println(a+":"+b);
       
      int[] array = {5,9};
      System.out.println(array[0]+":"+array[1]);
      testCallByRef(array);
      System.out.println(array[0]+":"+array[1]);
    }
    
}
