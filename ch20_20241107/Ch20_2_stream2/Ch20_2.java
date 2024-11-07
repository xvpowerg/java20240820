/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20241107.Ch20_2_stream2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Vivin");
        st1.addScore(75);
        st1.addScore(83);
        st1.addScore(99);
        st1.addScore(67);
        st1.foreach();
        System.out.println("==================");
        ArrayList<Integer> scoreList 
                    =  st1.getScoreList();
        scoreList.add(77);
        scoreList.add(55);
        System.out.println("==================");
         st1.foreach();
                 System.out.println("==================");
         st1.getScoreStream().forEach(s->System.out.println(s));
    }
    
}
