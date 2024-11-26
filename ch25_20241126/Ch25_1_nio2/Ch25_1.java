/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20241126.Ch25_1_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch25_1 {
    
    public static void main(String[] args) {
        
        Path p1 =  Paths.get("c:", "mydir","dir","dir1");
        Path p2 =  Paths.get("c:", "mydir","dir");
        Path p2_2 =  Paths.get("c:", "mydir");
        
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
        Path p3_2 = p1.relativize(p2_2);
        System.out.println(p3_2);
        
        Path p4 =  Paths.get("c:", "mydir","dir","dir1");
        Path p5 =  Paths.get("d:", "mydir","dir");
        p4.relativize(p5);
    }
    
}
