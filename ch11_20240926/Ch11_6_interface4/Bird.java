/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240926.Ch11_6_interface4;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Bird implements Fly {
   public int flying(){
       System.out.println("Bird Flying");
       Random ran = new Random();
       //0~549隨機選一個
       return ran.nextInt(Fly.MAX_FLY_SPEED+500);
   }
}
