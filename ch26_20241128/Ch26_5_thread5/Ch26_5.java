/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20241128.Ch26_5_thread5;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public class Ch26_5 {

    public static void main(String[] args) {
        
        ExecutorService es = Executors.newFixedThreadPool(4);
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i<= 10;i++){
            es.submit(()->{
                try{
                     TimeUnit.SECONDS.sleep(2);
                }catch(Exception ex){
                    System.out.println(ex);
                }               
                System.out.println(Thread.currentThread().getName());            
            });
        }
        es.shutdown();
        
    }
    
}
