/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240829;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {

    static void testVoid(int x){
        //void的return 是中斷函數
        if (x > 5){
            return;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        testVoid(2);
        testVoid(3);
        testVoid(9);
        
    }
    
}
