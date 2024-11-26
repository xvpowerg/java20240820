/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20241126.Ch25_6_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public class Ch25_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Path mydir = Paths.get("c:", "mydir","dir");
         
       try{
             Stream<Path> s2 =Files.walk(mydir);
             s2.filter(p->Files.isDirectory(p)).forEach(p->System.out.println(p));
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
