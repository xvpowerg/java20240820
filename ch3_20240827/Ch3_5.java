/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;

/**
 *
 * @author xvpow
 */
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array1 =new int[3][2];
        int[] array2[] = new int[2][3];
        int array3[][] = new int[2][2];
        int[][] array4 = {{5,6,7},
                           {1,5,8}};
        int[][] array5 = new int[][]{
            {4,5,6},
            {7,89,70}
        };
        
        
       for (int i= 0; i< array4.length;i++){
           for (int k = 0; k < array4[i].length;k++){
               System.out.print(array4[i][k]+" ");
           }
           System.out.println();
       }
        
       System.out.println();
       
       for (int[] v1 : array5){
            for (int v : v1){
                    System.out.print(v+" ");
            }
            System.out.println();
       }
       
    }
    
}
