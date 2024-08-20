/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240820;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello!");
        //基本型態
        //整數類型 無小數點的
        //byte 8bit -128 ~ 127
        //short 16bit -32768 ~ 32767
        //int 32bit -2147483648 ~ 2147483647 *預設情況
        //long 64bit 
        byte b1 = 12;
        System.out.println(b1);
        short s2 = 180;
        System.out.println(s2);
        int i3 = 85600;
        System.out.println(i3);
        long myLog = 2147483649L;
        System.out.println(myLog);
        //浮點數類型 有小數點的數
        float f1 = 3.1415f;//32bit 小數點 7位
        double d2 = 2.71828;//64bit 小數點14位 預設
        System.out.println(f1);
        System.out.println(d2);
        //字元 16bit 0~65535
        char c1 = 'B';
        char c2 = 68;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);
        //布林 boolean 
        boolean isOpen = true;
        boolean isClose = false;
        System.out.println(isOpen);
        System.out.println(isClose);
        //String 參考型態
        String msg = "Ken";
        System.out.println(msg);
        
        
    }
    
}
