/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240903;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {
    static int sum(int ... values){
       int ans = 0;
       for(var v : values){
          ans += v;
       }
       return ans;
    }
    static int sum(int a,int b){        
        return sum(a,b,0);
    }
   static int sum(int a,int b,int c){
       
        return sum(a,b,c,0);
   }
    public static void main(String[] args) {
        int value = sum(5,3);
        int value2 = sum(5,3,2);
        int value3 = sum(5,3,2,7);
        int value4 = sum(5,3,2,7,9);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        
    }
    
}
