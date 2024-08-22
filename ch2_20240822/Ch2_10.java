/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i =2; i<= 9; i++){
            
            for (int k = 1; k <= 9; k++){
                
                System.out.printf("%d*%d=%2d ",i,k,i*k);
            }
            System.out.println();
        }
        
    }
    
}
