/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20241010.Ch14_2_methodrf2;

/**
 *
 * @author xvpow
 */
public class Ch14_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MyClass myClass1 = new MyClass();
      myClass1.testRun();
      
      
      myClass1.runTestIF2(myClass1::testMyIF2, 17);
      
      
    }
    
}
