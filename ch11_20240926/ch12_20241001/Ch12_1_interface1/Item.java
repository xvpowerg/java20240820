/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20241001.Ch12_1_interface1;

/**
 *
 * @author xvpow
 */
public class Item {
    private String nmae;
    private int price;
    Item(String name,int price){
        this.nmae = name;
        this.price = price;
    }
    
    public String toString(){
        return nmae+":"+price;
    }
    
}
