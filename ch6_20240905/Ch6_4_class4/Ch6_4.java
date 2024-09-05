/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240905.Ch6_4_class4;

/**
 *
 * @author xvpow
 */
public class Ch6_4 {

    public static void main(String[] args) {
       Animal a1 = new Animal("Lulu",2,5);
       a1.setHeight(5.2f);
       a1.printInfo();
       //建構式沒有繼承
       Dog dog1 = new Dog();
       dog1.setName("Kiki");
       dog1.setAge(6);
       dog1.setHeight(10.2f);
       dog1.printInfo();
       
       Cat cat1 = new Cat();
       cat1.setName("mimi");
       cat1.setAge(2);
       cat1.setHeight(3.6f);
       cat1.printInfo();
       
       
       Dog dog2 = new Dog("Bobo",2,8);
       dog2.printInfo();
       Cat cat2 = new Cat("yumi",1,3);
       cat2.printInfo();
    }
    
}
