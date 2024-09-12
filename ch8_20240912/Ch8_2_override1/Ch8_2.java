/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240912.Ch8_2_override1;

/**
 *
 * @author xvpow
 */
public class Ch8_2 {

    /*
     1 modifider只能開放不能封閉
         public
         protected
         default
         private
     2 回傳值如果是基本型態必須一樣 如果是參考型態可以是子類
    
     3 傳入的參數類型必須一樣
    
     4 可選拋出例外 或不拋 或 拋子類例外
    
    */
    public static void main(String[] args) {
        Test1 t2 = new Test2();
        t2.testPublic();
        t2.testProtected();
        t2.testDefault();
    }
    
}
