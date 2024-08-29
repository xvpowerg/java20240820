/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240829;
import java.util.Arrays;

public class Ch4_1 {


    public static void main(String[] args) {
       
        int[] array = {18,11,45,50,20,35};
        Arrays.sort(array);
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
        
      
         int index = Arrays.binarySearch(array,20);
         System.out.println(index);
         index = Arrays.binarySearch(array,45);
         System.out.println(index);
         //找不到負數
         //大於所有
         index  = Arrays.binarySearch(array, 60);
         System.out.println(index);
         //小於所有 -1
         index  = Arrays.binarySearch(array, 5);
         System.out.println(index);
         //在中間
         index  = Arrays.binarySearch(array, 37);
         System.out.println(index);
         
    }
    
}
