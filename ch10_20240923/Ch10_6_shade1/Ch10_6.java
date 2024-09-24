/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240923.Ch10_6_shade1;

/**
 *
 * @author xvpow
 */
public class Ch10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //遮蔽 所有的屬性 靜態的方法 屬性
        //複寫 非靜態的方法
        
        //遮蔽 看類別
        //複寫 看物件
        
        
        Test2 t1 = new Test2();
        t1.value1();
        System.out.println(t1.myValue);
        Test1 t2 = new Test1();
        t2.value1();
    }
    
}
