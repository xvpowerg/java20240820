/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_4_io4;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f1 = new File("C:\\mydir\\msg_write.txt");
        try(FileWriter fw = new FileWriter(f1)){
            fw.write("Hell! 你好!!!");
        }catch(IOException ex){
            System.out.println(ex);
        }
        
        
    }
    
}
