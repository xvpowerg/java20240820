/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float bmi = 25.2f;
        
        if (bmi < 18.5){
            System.out.println("Too light");
        }else if(bmi >= 18.5 &&  bmi <= 24){
            System.out.println("Normal");
        }else{
            System.out.println("OverWeight");
        }
        
    }
    
}
