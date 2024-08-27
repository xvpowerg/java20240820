/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[2];
        System.out.println(array1[0]);
        float[] array2 = new float[2];
        System.out.println(array2[0]);
        char[] array3 = new char[2];
        System.out.println(array3[0]);
        boolean[] array4 = new boolean[2];
        System.out.println(array4[0]);
        String[] array5 = new String[2];
        System.out.println(array5[0]);
        System.out.println(array5[0].equals(""));// java.lang.NullPointerException
    }
    
}
