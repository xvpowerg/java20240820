/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240926.Ch11_1_abstract1;

/**
 *
 * @author xvpow
 */
public abstract class Animal {
    
    private String name;
    private int age;
    public Animal(String name,int age){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    
    public abstract String getType();
   public String toString(){
       return this.getType()+":"+this.getName()+":"+this.getAge();
   }
    
}
