/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240923.Ch10_5_static1;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        //資源共享節省記憶體空間
        st1.setName("Ken");
        st1.setAag(10);
        
        st2.setName("Iris");
        st2.setAag(12);
        
        System.out.println(st1);
        System.out.println(st2);
  
    }
    
}
