/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240829;


public class Ch4_5 {
    static void test(int n){
        System.out.println("Start:"+n);
        if (n <= 3){
            System.out.println(n);
            test(n + 1);
            //遞迴會記錄變數與位置的概念
        }
        System.out.println("End:"+n);
    }
    public static void main(String[] args) {
       test(1);
    }
    
}
