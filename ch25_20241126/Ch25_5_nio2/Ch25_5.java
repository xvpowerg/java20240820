/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20241126.Ch25_5_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch25_5 {

    
    public static void main(String[] args) {
        Path mydir = Paths.get("c:", "mydir","dir");
        try{
          Stream<Path> s =   Files.list(mydir);
          s.forEach(p->System.out.println(p));
        }catch(IOException ex){
            System.out.println(ex);
        }
         System.out.println("==================");
        //Integer.MAX_VALUE
        try{
             Stream<Path> s2 =Files.walk(mydir,0);
             s2.forEach(v->System.out.println(v));
        }catch(IOException ex){
            System.out.println(ex);
        }
       
        
    }
    
}
