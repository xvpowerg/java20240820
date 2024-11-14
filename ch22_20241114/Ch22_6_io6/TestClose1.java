/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20241114.Ch22_6_io6;
import java.lang.AutoCloseable;
/**
 *
 * @author xvpow
 */
public class TestClose1 implements AutoCloseable{
    private String name;
    private boolean canThrw;
    TestClose1(String name,boolean canThrw){
        this.name = name;
        this.canThrw = canThrw;
    }
    
    public String toString(){
        return this.name;
    }
    
    public void close(){
        System.out.println(this.name+":close");
        if (canThrw){
            throw new RuntimeException(this.name+" Close Exception");
        }
    }
}
