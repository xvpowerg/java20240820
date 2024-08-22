/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score = 25;
        String msg = score  >= 60 ?"Pass":"Fall";
        System.out.println(msg);
        
        int v1 = 10;
        int v2 = 2;
        
        int ans = v1 + (v2 < 0 ? v2*-1 : v2);
        System.out.println(ans);
        
        
    }
    
}
