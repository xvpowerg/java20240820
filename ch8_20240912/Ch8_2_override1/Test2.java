/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240912.Ch8_2_override1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    @Override
    public void testPublic(){
        System.out.println("Test2 testPublic");
    }
     @Override
    protected void testProtected(){
          System.out.println("Test2 testProtected");
    }
     @Override
    void testDefault(){
        System.out.println("Test2 testDefault");
    }
    
    //@Override
    private void testPrivate(){
        System.out.println("Test2 testDefault");
    }
}
