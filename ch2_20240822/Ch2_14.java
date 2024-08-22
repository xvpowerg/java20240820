/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tag1:
        for (int i = 1; i<= 3; i++){
            System.out.println("Start:"+i);
            for (int k = 1; k <= 5; k++){
                
                System.out.println("Start:"+i+"_"+k);
                if (i == 2){
                    continue tag1;
                }
                System.out.println(i+"_"+k);
                System.out.println("End:"+i+"_"+k);
            }
            System.out.println("End:"+i);
            System.out.println();
        }
    }
    
}
