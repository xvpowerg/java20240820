/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20241029.Ch18_2_treeset2;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Student s1 = new Student("Ken",100,87,69);
        Student s2 = new Student("Iris",82,95,63);
        Student s3 = new Student("Vivin",100,87,55);
        Student s4 = new Student("Lucy",100,77,69);
        Student s5 = new Student("joy",100,87,69);
        int action = 2; //1 小到大  2 大到小
        Comparator<Student>stCmp =  Comparator.comparing(st->st.getScore1());
        stCmp = stCmp.thenComparing(st->st.getScore2()).
                thenComparing(st->st.getScore3()).thenComparing(st->st.getName());
        if (action  == 2) 
            stCmp =  stCmp.reversed();
        TreeSet<Student> ste1 = new TreeSet(stCmp);
        ste1.add(s1);
        ste1.add(s2);
        ste1.add(s3);
        ste1.add(s4);
        ste1.add(s5);
        ste1.forEach(System.out::println);
    }
    
}
