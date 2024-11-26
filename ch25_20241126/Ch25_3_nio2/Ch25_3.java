/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20241126.Ch25_3_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
/**
 *
 * @author xvpow
 */
public class Ch25_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path src = Paths.get("c:", "mydir","netbeans-23-source.zip");
        Path tartget = Paths.get("c:", "mydir","netbeans-23-source_copy.zip");
      try{
          Files.copy(src, tartget,StandardCopyOption.REPLACE_EXISTING);
      }catch(IOException ex){
          System.out.println(ex);
      }
        
    }
    
}
