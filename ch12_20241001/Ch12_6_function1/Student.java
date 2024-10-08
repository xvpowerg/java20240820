/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20241001.Ch12_6_function1;
import java.util.ArrayList;
public class Student implements Iterator<Integer>{
    private String name;
    private ArrayList<Integer> scoreList = 
                new ArrayList();
    public Student(String name){
        this.name = name;
    }
    public void addScore(int score){
        scoreList.add(score);
    }
    public String getName(){
        return name;
    }
    
    public int size(){
        return scoreList.size();
    }
    
    public Integer get(int index){
        return scoreList.get(index);
    }
}
