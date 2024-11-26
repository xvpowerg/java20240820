/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20241126.Ch25_2_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ch25_2 {

   
    public static void main(String[] args) {
       
        Path p1 = Paths.get("c:","mydir","dir1",".","dir2");
        System.out.println(p1);
        Path p2 = Paths.get("c:","mydir","dir1","..","dir2");
        System.out.println(p2);
        
        System.out.println(p1.normalize());
        System.out.println(p2.normalize());
        
    }
    
}
