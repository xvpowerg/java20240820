/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240903;

/**
 *
 * @author xvpow
 */
public class Ch5_8 {

   /*
     多載的順序
    1 相同類型
    2 相同類型可相容
    3 不同類型可相容
    4 封箱類型    
    */
    static void test1(int v1){
        System.out.println("test1 int v1");
    }
    
    static void test1(float f1){
        System.out.println("test1 float f1");
    }
    
    static void test2(short s1){
        System.out.println("test2 short s1");
    }
    static void test2(int v2){
        System.out.println("test2 int v2");
    }
    
    static void test3(long v1){
        System.out.println("Test3 Long v1");
    }
    static void test3(float f1){
        System.out.println("Test3 Float f1");
    }
    
    static void test4(short s1){
        System.out.println("test4 short s1");        
    }
    static void test4(float f1){
        System.out.println("test4 float f1");        
    }
    
    
    static void test5(short s1){
        System.out.println("test5 short s1");
    }
    
     static void test5(Integer i1){
        System.out.println("test5 Integer i1");
    }
     
     static void test6(short s1){
           System.out.println("test6 short s1");
     }
     static void test6(Float f1){
           System.out.println("test6 Float f1");
     }
    
    public static void main(String[] args) {
        
        //test6(12);//會出錯因為Integer與Float不相容
        //test5(6);
        //test4(5);
        //test3(15);
        
        /*
        test2(10);
        short vx = 25;
        test2(vx);*/
        
        //test1(10);
        //test1(2.5f);
    }
    
}
