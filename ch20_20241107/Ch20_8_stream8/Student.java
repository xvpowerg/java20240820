/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20241107.Ch20_8_stream8;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score;
    private ArrayList<String> books;
    Student(String name,int score){
        this.name = name;
        this.score = score;
        this.books = new ArrayList();
    }
    public String getName(){
        return this.name;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void addBook(String book){
        books.add(book);
    }
    public Stream<String> getBookStream(){
       return books.stream();
    }
}
