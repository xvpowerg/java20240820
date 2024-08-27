/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array1 = new int[3][];
       array1[0] = new int[]{1,2,5};
       array1[1] = new int[]{3,8};
       
       System.out.println(array1[0][1]);
       //System.out.println(array1[1][2]);//java.lang.ArrayIndexOutOfBoundsException
       System.out.println(array1[2][0]);//java.lang.NullPointerException
    }
    
}
