/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20241001.Ch12_1_interface1;

/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    static void foreachData(Iterator it){
       it.foreach();
    }
    public static void main(String[] args) {
       Student st1 = new Student("Ken");
       System.out.println(st1.getName());
       st1.addScore(75);
       st1.addScore(83);
       st1.addScore(97);
       foreachData(st1);
       
       Basket b1 = new Basket();
       Item t1 = new Item("A1",50);
       Item t2 = new Item("B2",78);
       Item t3 = new Item("C3",95);
       b1.addItem(t1);
       b1.addItem(t2);
       b1.addItem(t3);
       foreachData(b1);
    }
    
}
