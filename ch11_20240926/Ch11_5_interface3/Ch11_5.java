/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240926.Ch11_5_interface3;

/**
 *
 * @author xvpow
 */
public class Ch11_5 {

    static void testSuperManSkill(SuperManSkill skill){
        skill.flying();
        skill.jumping();
        skill.runing();
    }
    public static void main(String[] args) {
        SuperMan man1 = new SuperMan();
        testSuperManSkill(man1);
        System.out.println(Fly.FLY_MAX_SPEED);
    }
    
}
