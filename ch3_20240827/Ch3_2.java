/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int array2[] = new int[3];
        int[] array3 = {6,7,9,5};//一開始建立初始化時給定預設值
        int[] array4 = new int[]{8,9,11,2,5};//陣列建立後修改陣列大小時給預設值
        
        //for 輸出 array3
        for (int i =0; i < array3.length; i++){
            System.out.print(array3[i]+" ");
        }
        System.out.println();
        //foreach 輸出 array4
       for(int v : array4){
           System.out.print(v+" ");
       }
        System.out.println();
        
       int[] array5 = new int[2];
       array5[0] = 9;
       array5[1] = 8;
       for(int i =0; i < array5.length;i++){
           System.out.print(array5[i]+" ");
       }
       System.out.println();
       array5 = new int[]{9,8,11,12,13};
       for(int v : array5){
           System.out.print(v+" ");
       }
    }
    
}
