/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20241008.ch13_6_lambda3;
import java.util.function.Predicate;
import java.util.ArrayList;

public class Ch13_6 {
  
    static ArrayList<Integer> filter(ArrayList<Integer>  
            data,Predicate<Integer> p){
        ArrayList<Integer>  myList = new ArrayList<Integer> ();
        for (int v : data){
            if (p.test(v)){
                myList.add(v);
            }
        }
       
        return myList;
    }
    
    public static void main(String[] args) {
      ArrayList<Integer> data = new ArrayList<>();
      data.add(5);
      data.add(6);
      data.add(11);
      data.add(2);
      data.add(7);
      ArrayList<Integer> a1 =  filter(data,(Integer i)-> {
          return i % 2 != 0;
      });
      a1.forEach((Integer v)->System.out.print(v+" "));
      System.out.println();
      
      
      ArrayList a2 = filter(data,i->i%2==0);
      a2.forEach(v->System.out.print(v+" "));
       System.out.println();
    }
    
}
