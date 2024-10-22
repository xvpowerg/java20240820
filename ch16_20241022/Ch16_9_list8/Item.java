/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20241022.Ch16_9_list8;

/**
 *
 * @author xvpow
 */
public class Item {
    private int price;
    private String name;
    
    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return name+":"+price;
    }
    
    public boolean equals(Object obj){
        Item tmpIt = (Item)obj;
        return  this.price == tmpIt.price && this.name.equals(tmpIt.name);
    }
    
}
