/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240910.Ch7_6_2_modifider1;
import ch7_20240910.Ch7_6_modifider1.Test1;
/**
 *
 * @author xvpow
 */
public class Ch7_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(t1.publicMsg);
        Test2 t2 = new Test2();
        t2.showProtected();
    }
    
}
