/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20241121.Ch24_4_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Ch24_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 =  Paths.get("C:", "mydir","msg.txt");
      System.out.println(p1);
      
      Path p2 =  Paths.get("C:", "A","B","C","D");
      System.out.println(p2.getName(2));
      System.out.println(p2.getName(0));
      System.out.println(p2.getNameCount());
      System.out.println("root:"+p2.getRoot());
      System.out.println("================");
      Path p3 =  Paths.get("C", "A","B","C","D");
      System.out.println("root:"+p3.getRoot());
      System.out.println(p3.getName(2));
      System.out.println(p3.getName(0));
      System.out.println(p3.getNameCount());
    }
    
}
