/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20241024.Ch17_5_set5;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch17_5 {
    
    public static class StComparator implements Comparator<Student>{
        
        public int compare(Student st1,Student st2){
            
            if (st1.getScore1() > st2.getScore1()){
                return 1;
            }else if (st1.getScore1() < st2.getScore1()){
                return -1;
            }else if(st1.getScore2() > st2.getScore2()){
                return 1;
            }else if(st1.getScore2() < st2.getScore2()){
                return -1;
            }else if(st1.getScore3() > st2.getScore3()){
                return 1;
            }else if(st1.getScore3() < st2.getScore3()){
                return -1;
            }
            return st1.getName().compareTo(st2.getName());            
        }
        
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("Ken",100,87,69);
        Student s2 = new Student("Iris",82,95,63);
        Student s3 = new Student("Vivin",100,87,55);
        Student s4 = new Student("Lucy",100,77,69);
        Student s5 = new Student("joy",100,87,69);

        TreeSet<Student> ste1 = new TreeSet(new StComparator());
        ste1.add(s1);
        ste1.add(s2);
        ste1.add(s3);
        ste1.add(s4);
        ste1.add(s5);
        ste1.forEach(System.out::println);
        
        
        
    }
    
}
