/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20241128.Ch26_4_thread4;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;
public class Ch26_4 {

    
    public static void main(String[] args) {
       ExecutorService es =  Executors.newCachedThreadPool();
       Random random = new Random();
       for (int i =1; i<=50;i++){
             es.submit(()->{  
                int seed = random.nextInt(5)+1;
                try{
                      Thread.sleep(seed*1000);
                }catch(Exception ex){
                    
                }              
                System.out.println("Thread:"+Thread.currentThread());

            });
       }
       
       es.shutdown();
      //es.shutdownNow();
    }
    
}
