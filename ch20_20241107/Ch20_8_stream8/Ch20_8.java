/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20241107.Ch20_8_stream8;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken",75);
        Student st2 = new Student("Vivin",80);
        Student st3 = new Student("Lucy",65);
        Student st4 = new Student("Joy",77);
        Student st5 = new Student("Iris",95);
        Student st6 = new Student("Sean",100);
        //希望有一個ArrayList 內容有st1~st6
        //找出成績大於等於80的 轉成字串 輸出name:score
        ArrayList<Student> stList = new ArrayList();
        stList.add(st1);
        st1.addBook("Java");
        st1.addBook("Python");
        st1.addBook("Go");
        stList.add(st2);
        st2.addBook("Java");
        st2.addBook("Python");
        stList.add(st3);
        st3.addBook("C++");
        st3.addBook("Python");
        st3.addBook("PHP");
        stList.add(st4);
        st4.addBook("ML");
        st4.addBook("Python");
        st4.addBook("Java");
        stList.add(st5);
        st5.addBook("HTML");
        st5.addBook("JavaScript");
        st5.addBook("Java");
        stList.add(st6);
        st6.addBook("Go");
        st6.addBook("Python");
        
        stList.stream().filter(st->st.getScore() >= 80).
                map(st->st.getName()+":"+st.getScore()).
                forEach(info->System.out.println(info));
        
        System.out.println("======================");
        
        stList.stream().flatMap(st->st.getBookStream()).
                distinct().forEach(b->System.out.println(b));
        
    }
    
}
