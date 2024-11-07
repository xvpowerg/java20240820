/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20241107.Ch20_1_stream1;
import java.util.ArrayList;
import java.util.stream.Stream;
public class Ch20_1 {

 
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Iris");
       list.add("Joy");
       
       //Stream
       //1 惰性與終端
       //2 不可重複使用
       //3 不可修改性
       
       //1 惰性與終端
        boolean testLen= list.stream().
                peek(v->System.out.println("Peek:"+v)).
                allMatch(s->s.length() > 1);
        
        System.out.println(testLen);
        //不可重複使用
        //因為Stream已使用過
        //Stream<String> st1 = list.stream();
        //st1.filter(v->v.length() > 3);
        //st1.count();
        System.out.println("===========================");
        //3 不可修改性
        list.stream().filter(v->v.length() > 3).forEach(v->System.out.println(v));
        System.out.println(list);
    }
    
}
