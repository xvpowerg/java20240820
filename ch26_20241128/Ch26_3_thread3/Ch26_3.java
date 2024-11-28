/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20241128.Ch26_3_thread3;

/**
 *
 * @author xvpow
 */
public class Ch26_3 {

    static class TestLock{
        String msg="";
        synchronized void  test1(TestLock lock){
            msg = lock.msg;
            System.out.println("test1:"+msg);
            lock.test2();
        }
        
       synchronized void test2(){
            System.out.println("test2:"+msg);
        }
    }
    
    
    public static void main(String[] args) {
        TestLock lock1 = new TestLock();
        lock1.msg = "lock1";
        TestLock lock2 = new TestLock();
        lock2.msg = "lock2";
        Thread th1 = new Thread(()->{
            lock1.test1(lock2);
        });
        
        Thread th2 = new Thread(()->{
            lock2.test1(lock1);
        });
        
        th1.start();
        th2.start();
    }
    
}
