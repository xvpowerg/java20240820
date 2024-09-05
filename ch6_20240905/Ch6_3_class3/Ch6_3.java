/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240905.Ch6_3_class3;

/**
 *
 * @author xvpow
 */
public class Ch6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal a1 = new Animal();
       //name 長度必須大於0
       //name 不可為null
       //如不符合條件顯示錯誤的姓名
       //a1.name = null;
       //a1.age = -5;
       //a1.setName("");
       a1.setName(null);
       a1.setAge(-5);
       a1.printInfo();
    }
    
}
