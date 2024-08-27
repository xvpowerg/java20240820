/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array1 = new int[2][];
       array1[0] = new int[]{5,6,7};
       array1[1] = new int[2];
       array1[1][0] = 10;
       array1[1][1] = 35;
       
       for (int i = 0; i < array1.length;i++){
           for (int k = 0; k < array1[i].length;k++){
               System.out.print(array1[i][k]+" ");
           }
           System.out.println();
       }
       
    }
    
}
