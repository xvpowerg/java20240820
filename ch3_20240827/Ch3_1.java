/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] intArray = new int[3];
       intArray[0] = 25;
       intArray[1] = 35;
       intArray[2] = 78;
      System.out.println("len:"+intArray.length);
       for (int i = 0; i <intArray.length ;i++){
           System.out.print(intArray[i]+" ");
       }
       /*System.out.println();
       var x = intArray[3];
       System.out.println(x);//ArrayIndexOutOfBoundsException
        */
        System.out.println();
        
        for (int v : intArray){
            System.out.print(v+" ");
        }
       
    }
    
}
