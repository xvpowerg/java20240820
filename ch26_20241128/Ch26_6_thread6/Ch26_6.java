/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20241128.Ch26_6_thread6;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch26_6 {

  
    public static void main(String[] args) {
           ExecutorService es =  Executors.newCachedThreadPool();
           Random radom = new Random();
      Future<Integer>  f1 =    es.submit(()->{
             
              TimeUnit.SECONDS.sleep(5);
            int v =  radom.nextInt(100);
            return v;
           });
      try{
         System.out.println("等待.....");  
            int v = f1.get();    
         System.out.println("完成....."+v);     
      }catch(Exception ex){
          
      }
      
    }
    
}
