/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20241008.ch13_5_lambda2;
import java.util.function.UnaryOperator;

public class Ch13_5 {

    static void addArray(int[] array,UnaryOperator<Integer> op){
        for (int i = 0; i < array.length;i++){
           int value =  op.apply(array[i]);
           array[i] = value;
        }
    }
    public static void main(String[] args) {
       int [] array = {7,2,5,6,3};
        
       addArray(array,new UnaryOperator<Integer>(){
           public Integer apply(Integer v){
               return v + 3;
           }
       });
       
       for (int v :array){
           System.out.print(v+" ");
       }
       System.out.println();
       
       int [] array2 = {7,2,5,6,3};
       addArray(array2,(Integer v)->{
           return v * 2;
       }); 
       
       for (int v: array2){
           System.out.print(v+" ");
       }
        System.out.println();
    }
    
}
