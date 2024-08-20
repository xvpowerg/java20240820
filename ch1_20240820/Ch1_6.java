/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240820;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v1 = 10;
        int v2 = 2;
        int c = 0;
        System.out.println(c);
        //且的短路只要碰到一個條件為false
        boolean b1 = v1 > v2 && ++c < 0;
        System.out.println(c);
         System.out.println(b1);
         c = 0;
         boolean b2 = v1 < v2 && ++c > 0;
         System.out.println(c);
         System.out.println(b2);
         //或的短路只要碰到true就短路
         c = 0;
         boolean b3 = v1 < v2 || ++c > 0;
         System.out.println(c);
         System.out.println(b3);
         
         c = 0;
         boolean b4 = v1 > v2 || ++c > 0;
         System.out.println(c);
         System.out.println(b4);
         
         
         
         
    }
    
}
