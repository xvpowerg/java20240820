/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240926.Ch11_4_interface2;

/**
 *
 * @author xvpow
 */
public class Ch11_4 {

   
    static void testFly(Fly fly){
        fly.flying();
    }
    
    static void testJump(Jump jump){
        jump.jumping();
    }
    static void testRun(Run run){
        run.runing();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        IronMan man1 = new IronMan();
        testFly(man1);
        testJump(man1);
        testRun(man1);
        
        SuperMan man2 = new SuperMan();
         testFly(man2);
        testJump(man2);
        testRun(man2);
    }
    
}
