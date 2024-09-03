/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240903;

/**
 *
 * @author xvpow
 */
public class Ch5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean b1 = true;
        boolean b2 = b1.booleanValue();
        System.out.println(b2);
        
        boolean b3 = Boolean.parseBoolean("true");
        System.out.println(b3);
        //只要是true就回傳true
        boolean b4 =  Boolean.parseBoolean("tRue");
        System.out.println(b4);
        
       boolean b5 = Boolean.parseBoolean("T  R  U   E");
       System.out.println(b5);
       boolean b6 = Boolean.parseBoolean("AABBCCDD");
        System.out.println(b6);
    }
    
}
