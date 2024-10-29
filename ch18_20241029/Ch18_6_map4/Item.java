/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20241029.Ch18_6_map4;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    
    public String toString(){
        return getName()+":"+getPrice();
    }
}
