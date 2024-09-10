/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240910.Ch7_1_class1;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal an1 = new Animal("Gigi",5);
      an1.setAge(2);
      an1.printInfo();
      
      Animal an2 = new Animal();
      //Empty , -1
      an2.printInfo();
      
    }
    
}
