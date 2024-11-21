/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20241121.Ch24_2_io2;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File f1 = new File("C:\\mydir\\student2.obj");
       try(FileInputStream fin = new FileInputStream(f1);
           ObjectInputStream obj = new ObjectInputStream(fin);){
           Student st1 = (Student)obj.readObject();
           System.out.println(st1);
       }catch(IOException|ClassNotFoundException ex){
           System.out.println(ex);
       }
       
    }
    
}
