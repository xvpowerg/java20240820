/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_1.beans1;

/**
 *
 * @author xvpow
 */
public class Teacher {
    private String name;
    public Teacher(String name){
        this.name = name;
    }
    
    public String toString(){
        return "Student:"+name;
    }
}