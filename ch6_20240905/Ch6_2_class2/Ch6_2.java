/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240905.Ch6_2_class2;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Joy";
        p1.age = 25;
        p1.printInfo();
        Person p2 = new Person("Ben",17);
        p2.printInfo();
        //物件導向要素
        //多型
        //複寫
        //繼承
        //封裝
    }
    
}
