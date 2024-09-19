/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240919.ch9_5_override_util;

/**
 *
 * @author xvpow
 */
public class Ch9_5 {
    public static void main(String[] args){
        Student st1 = new Student("Ken",15);
        Student st2 = new Student("Ken",15);
        System.out.println(st1.getName()+":"+st1.getAge());
         System.out.println(st1);
         String msg = st1+"";
         System.out.println(msg);
         System.out.println(st2);
         System.out.println(st1.equals(st2));
    }
}
