/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240910.Ch7_2_class2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String msg;
    
    Test1(String msg){
        this.msg = msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
                 
    }
    
    public String getMsg(){
        return msg;
    }
    
    public void printInfo(){
        System.out.println(msg);
    }
}

