/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20241008.ch13_7_lambda4;

/**
 *
 * @author xvpow
 */
public class Ch13_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestIF t1 = (String s1,int v2)->{
            System.out.println(s1+":"+v2);
        };
        t1.myfun("Value", 77);
        
         TestIF t2 = (s1,v2)-> System.out.println(s1+":"+v2);
        t2.myfun("Value", 88);
        
    }
    
}
