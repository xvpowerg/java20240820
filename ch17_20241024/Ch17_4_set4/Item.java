/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20241024.Ch17_4_set4;

/**
 *
 * @author xvpow
 */
public class Item implements Comparable<Item>{
    private int price;
    public Item(int price){
        this.price = price;
    }
    
    public String toString(){
        return price+"";
    }
    
    public int compareTo(Item it){
        if (this.price  > it.price){
            return 1;//正數
        }else if(this.price  < it.price){
            return -1;//負數
        }
        return 0;
    }
    
}
