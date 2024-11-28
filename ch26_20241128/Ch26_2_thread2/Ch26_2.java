/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20241128.Ch26_2_thread2;

/**
 *
 * @author xvpow
 */
public class Ch26_2 {
    static class Test1{
        int count = 0;
        
        synchronized void myRun(){

                for (int i =1; i<= 10;i++){
                    System.out.println(count++);

                }
        
        }
        
    }
 
    public static void main(String[] args) {
        Test1  t1 = new Test1();
//        t1.myRun();
//        t1.myRun();
        Thread th1 = new Thread(()->{t1.myRun();});
        Thread th2 = new Thread(()->{t1.myRun();});
        
        th1.start();
        th2.start();
        
        
    }
    
}
