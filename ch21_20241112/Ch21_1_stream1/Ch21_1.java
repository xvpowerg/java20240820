/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20241112.Ch21_1_stream1;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
public class Ch21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> myList = new ArrayList<>();
       myList.add(75);
       myList.add(88);
       myList.add(67);
       myList.add(93);
       myList.add(85);
       myList.add(72);
       myList.add(73);
       
      IntSummaryStatistics intSummary = 
              myList.stream().mapToInt(v->v).summaryStatistics();
      long count = intSummary.getCount();
      long sum = intSummary.getSum();
      System.out.println(sum);
      System.out.println(count);
    }
    
}
