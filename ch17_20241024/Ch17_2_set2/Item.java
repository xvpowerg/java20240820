/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20241024.Ch17_2_set2;

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
       return this.name +":"+this.price;
   }
   //先查HashCode
   //在查equals   
   public int hashCode(){
       return this.price+this.name.hashCode();
   }
   public boolean equals(Object it){
       Item tmpIt = (Item)it;
       return this.price == tmpIt.price &&
               tmpIt.name.equals(this.name);
   }
}
