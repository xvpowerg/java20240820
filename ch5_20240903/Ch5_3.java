/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240903;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {

    static int minus(int a,int b){
        int ans = a - b;
        return ans;
    }
    
    static float minus(float v1,float v2){
        float ans = v1 - v2;
        return ans;
    }
    
    public static void main(String[] args) {
       int v1 = minus(7,2);
       System.out.println(v1);
       float v2 = minus(9.2f,3.1f);
       System.out.println(v2);
       
    }
    
}
