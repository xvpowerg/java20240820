/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240820;

/**
 *
 * @author xvpow
 */
public class Ch1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = 5;
        int v3 = 8;
        //and && 左右都是true才為true
        //or || 單邊是true就是true
        //not ! 唱反調 true變為false
        
        System.out.println(v1 > v2 && v2 < v3);
        System.out.println(v1 > v2 && v1 < v3);
        
        System.out.println(v1 > v2 || v3 < v2);
        System.out.println(v2 > v1 || v3 < v2);
        
        System.out.println( !(v1 > v2));
        
        
    }
    
}
