/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240923.Ch10_2_init_block1;

/**
 *
 * @author xvpow
 */
public class Ch10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestBlock tb = new TestBlock();
        System.out.println(tb.getMsg(1));
        TestBlock tb2 = new TestBlock(10);
        System.out.println(tb2.getCount());
        System.out.println(tb2.getMsg(1));
    }
    
}
