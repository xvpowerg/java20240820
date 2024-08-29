/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240829;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {

    static int testReturn(int a,int b){
        int ans = a * b;
        return ans;//回傳
    }
    //回傳最大值
    static int max(int a,int b){
        return a > b ? a : b;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = testReturn(5,2);
        System.out.println(x);
        testReturn(6,9);
        int m = max(9,12);
        System.out.println(m);
    }
    
}
