/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240822;

/**
 *
 * @author xvpow
 */
public class Ch2_7 {

    
    public static void main(String[] args) {
        //String name = "Ken";    
        String name = null;    //java.lang.NullPointerException
        switch(name){
            case "Vivin":
                System.out.println("RD");
                break;
            case "Ken":
                System.out.println("PM");
                break;
            case "Iris":
                System.out.println("HR");
            default:
                System.out.println("Error");
        }
        
    }
    
}
