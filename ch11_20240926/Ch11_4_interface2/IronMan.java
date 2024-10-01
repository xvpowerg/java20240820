/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240926.Ch11_4_interface2;

/**
 *
 * @author xvpow
 */
public class IronMan implements Fly,Jump,Run  {
    public void flying(){
      System.out.println("IronMan Fly!!");
    }
    
    public void jumping(){
         System.out.println("IronMan Jumping!!");
    }
    
    public void runing(){
          System.out.println("IronMan Runing!!");
    }
}
