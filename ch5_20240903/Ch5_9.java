/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240903;

/**
 *
 * @author xvpow
 */
public class Ch5_9 {
  /*
     多載的順序
    1 相同類型
    2 相同類型可相容
    3 不同類型可相容
    4 封箱類型    
    */
    
    static void test1(int v1,int v2){
        System.out.println("test1 int v1,int v2");
    }
    
    static void test1(float f1,float f2){
        System.out.println("float f1,float f2");
    }
    
    static void test2(Integer v1,int v2){
        System.out.println("test2(Integer v1,int v2)");
    }
     static void test2(int v1,Integer v2){
        System.out.println("test2(int v1,Integer v2)");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //test2(10,25);//會出錯因為模稜兩可
        /*
        test1(10,15.5f);
        test1(10,15);*/
    }
    
}
