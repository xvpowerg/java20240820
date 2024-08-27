/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;
import java.util.Arrays;
public class Ch3_9 {

    public static void main(String[] args) {
       int[] array = {5,9,1,7,3,2};
       for(int i =0; i < array.length;i++){
           System.out.print(array[i]+" ");
       }
       System.out.println();
       Arrays.sort(array);//小到大遞增排序
       for(int i =0; i < array.length;i++){
           System.out.print(array[i]+" ");
       }
       
    }
    
}
