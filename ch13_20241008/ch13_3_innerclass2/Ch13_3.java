/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20241008.ch13_3_innerclass2;

/**
 *
 * @author xvpow
 */
public class Ch13_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dog dog1 = new Dog();
       dog1.bark();
       
       Dog dog2 = new Dog(){
           
           public void bark(){
               System.out.println("喵喵!");
           }
       
       };
       dog2.bark();
       
       Fly f1 = new Fly(){
           public void flying(){
               System.out.println("匿名類!!!");
           }
       };
       f1.flying();
    }
    
}
