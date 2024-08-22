/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int PLAY = 1;
         final int STOP = 2;
         final int EXIT =3;
        int action = STOP;
       //switch 可放的類型有 byte short int char enum String
        switch(action){
            case PLAY://變數必須是常數
                System.out.println("Play");
                break;
            case STOP:
                System.out.println("Stop");
                break;
            case EXIT:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
