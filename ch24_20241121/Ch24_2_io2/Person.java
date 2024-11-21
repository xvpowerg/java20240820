/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20241121.Ch24_2_io2;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Person  {
    private int height;
    private float weight;
    Person(){
        
    }
    Person(int height,float weight){
        this.height = height;
        this.weight = weight;
    }
    
    public String toString(){
        return this.height+":"+this.weight;
    }
}
