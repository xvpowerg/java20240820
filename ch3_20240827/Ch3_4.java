/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;

/**
 *
 * @author xvpow
 */
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[][] array2x3 = new int[2][3]; 
       array2x3[0][0] = 33;
       array2x3[0][2] = 25;
       array2x3[1][1] = 18;
       System.out.println(array2x3.length);
        System.out.println(array2x3[0].length);
       for (int i = 0; i < array2x3.length;i++){
           for (int k = 0; k < array2x3[i].length; k++){
               //System.out.print(i+":"+k+" ");
               System.out.print(array2x3[i][k]+" ");
           }
           System.out.println();
       }
       System.out.println();
       //foreach
       for (int[] v1 : array2x3){
           for (int v : v1){
               System.out.print(v+" ");
           }
           System.out.println();
       }
    }
    
}
