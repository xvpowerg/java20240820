/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20241126.Ch25_7_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
import java.nio.charset.Charset;
/**
 *
 * @author xvpow
 */
public class Ch25_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path p1 =  Paths.get("c:", "mydir","msg.txt");
      try{
        Stream<String> st1 =   Files.lines(p1, Charset.forName("big5"));
        st1.forEach(s->System.out.println(s));
      }catch(IOException ex){
          System.out.println(ex);
      }
      
    }
    
}
