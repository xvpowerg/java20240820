/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20241105.Ch19_6_option1;
import java.util.Optional;

public class Student {
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    public Optional<String> getName(){
        return Optional.ofNullable(name);
    }
    
}
