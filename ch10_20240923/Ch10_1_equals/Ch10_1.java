/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240923.Ch10_1_equals;

/**
 *
 * @author xvpow
 */
public class Ch10_1 {

    public static void main(String[] args) {
       Person p1 = new Person("Ken",10);
       Person p2 = new Person("Iris",15);
       Person p3 = new Person("Ken",10);
       Object obj = new Object();
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
       
       System.out.println(p1.equals(p2));
       System.out.println(p1.equals(p3));
       System.out.println(p1.equals(obj));
    }
    
}
