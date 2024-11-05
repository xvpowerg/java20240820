/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20241105.Ch19_2_generics1;

/**
 *
 * @author xvpow
 */
public class Ch19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyList myList = new MyList();
       myList.add("Ken");
       myList.add("Lucy");
       myList.add("Vivin");
       myList.add("Joy");
       myList.foreach(v->System.out.println(v));
       
       MyList<Integer> myList2 = new MyList();
       myList2.add(10);
       myList2.add(25);
       myList2.add(35);
       myList2.foreach(v->System.out.println(v));
       
       
    }
    
}
