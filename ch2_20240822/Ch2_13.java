/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        for (int i = 1; i <= 5; i++){
            if (i == 4){
                //break;//中斷迴圈
                continue;//繼續下一次
            }
            System.out.print(i+" ");
        }
        System.out.println();
        
        
    }
    
}
