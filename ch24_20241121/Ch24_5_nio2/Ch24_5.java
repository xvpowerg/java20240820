/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20241121.Ch24_5_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_5 {

 
    public static void main(String[] args) {
       Path p1 =  Paths.get("msg.txt");      
       Path p2 =  Paths.get("c:","myfile","data");      
       Path newPath = p2.resolve(p1);
       System.out.println(newPath);
       Path newPath2 = p1.resolve(p2);//resolve內容是路徑 會取代
       System.out.println(newPath2);
       
    }
    
}
