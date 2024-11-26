/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20241126.Ch25_4_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch25_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //msg1.txt 不存在的
       Path p1 =  Paths.get("c:", "mydir","msg1.txt");
       Path p2 =  Paths.get("c:", "mydir","msg.txt");
       try{
           boolean isSame = Files.isSameFile(p1, p2);
           System.out.println(isSame);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}
