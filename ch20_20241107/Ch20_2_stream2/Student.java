/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20241107.Ch20_2_stream2;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private ArrayList<Integer> scoreList;
    Student(String name){
        this.name = name;
        this.scoreList = new ArrayList();
    }
    
    public void addScore(int score){
        this.scoreList.add(score);
    }
    
    public ArrayList getScoreList(){
        return this.scoreList;
    }
    
    
    public Stream<Integer> getScoreStream(){
        return this.scoreList.stream();
    }
    public void foreach(){
        //輸出scoreList的所有內容
        //60
        //70
        //80        
        this.getScoreList().forEach(s->System.out.println(s));
    }
}
