/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240905.Ch6_1_class1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    
    public static void main(String[] args) {
      Student st1 = new Student();
      st1.name = "Ken";
      st1.score = 75;
      st1.height = 185;      
      
      Student st2 = new Student();
      st2.name = "Iris";
      st2.score = 82;
      st2.height = 162;
      
      Student st3 = new Student();
      st3.name = "Lucy";
      st3.score = 71;
      st3.height = 152;
      
      //System.out.println(st1.name+":"+st1.score+":"+st1.height);
      //System.out.println(st2.name+":"+st2.score+":"+st2.height);
      
      st1.printInfo();
      st2.printInfo();
      st3.printInfo();
              
    }
    
}
