/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20241114.Ch22_1_io1;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_1 {

    public static void main(String[] args) {
        File f1 = new File("C:\\mydir\\msg.txt");        
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        
        File f2 = new File("C:\\mydir\\msg2.txt");
        try{
             f2.createNewFile();
        }catch(IOException ex){
            System.out.println(ex);
        }
        File f3 = new File("C:\\mydir\\msg2.txt");
       boolean isDel =  f3.delete();
       System.out.println(isDel);
        
    }
    
}
