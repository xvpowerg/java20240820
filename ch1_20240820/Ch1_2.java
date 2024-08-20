/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240820;

/**
 *
 * @author xvpow
 */
public class Ch1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1 = 10;
        int x2 = 3;
        int ans = x1 + x2;
        System.out.println(x1+"+"+x2+"="+ans);
        ans = x1 - x2;
        System.out.println(x1+"-"+x2+"="+ans);
        ans = x1 * x2;
        System.out.println(x1+"*"+x2+"="+ans);
        //java除法整數除整數還是整數(無條件捨去)
        ans = x1 / x2;
        System.out.println(x1+"/"+x2+"="+ans);
        float ans2 = x1 / (float)x2;
        System.out.println(x1+"/"+x2+"="+ans2);
        //餘數
        ans = x1 % x2;
        System.out.println(x1+"%"+x2+"="+ans);
    }
    
}
