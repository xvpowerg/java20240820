/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240829;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {
    static void test1(){
        System.out.println("Test1");
    }
    static void sum(int v1,int v2){
        int ans = v1 + v2;
        System.out.println(ans);
    }
    
    static void testForLoop(int s,int e){
        
        for (int i =s; i <= e; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void testForLoop(int e ){
        testForLoop(1,e);
    }
    public static void main(String[] args) {
        test1();
        sum(10,15);
        
       testForLoop(1,5);
       testForLoop(6,18);
       testForLoop(9);
       
    }
    
}
