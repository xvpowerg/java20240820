/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20241121.Ch24_3_io3;
import java.io.Serializable;
import java.io.IOException;
import java.util.Random;

public class Item implements Serializable{
    private String name;
    private int code;
    
    Item(String name,int code){
        this.name = name;
        this.code = code;
    }
    
    public String toString(){
        return this.name+":"+this.code;
    }
    
    private void writeObject(java.io.ObjectOutputStream out)throws IOException{
        System.out.println("writeObject!!!");
        out.writeObject(this.name);
    }
    
    private void readObject(java.io.ObjectInputStream in)throws IOException,ClassNotFoundException{
        System.out.println("readObject!!!");
        this.name = (String)in.readObject();
        Random random = new Random();
        this.code = random.nextInt();
    }
    
    
}
