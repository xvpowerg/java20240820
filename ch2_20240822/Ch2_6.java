/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int action = 5;
       
       switch(action){
           default:
               System.out.println("Default!");
               break;
           case 1:
           case 2:
               System.out.println("A");
               break;
           case 3:
               System.out.println("B");
               break;
           
       }
       
    }
    
}
