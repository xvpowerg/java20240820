/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20241121.Ch24_1_io1;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_1_2 {

    public static void main(String[] args) {
         File f1 = new File("C:\\mydir\\student.obj");
        try(FileInputStream fin = new FileInputStream(f1);
            ObjectInputStream objIn = new  ObjectInputStream(fin)  ){
            
            Student st1 = (Student) objIn.readObject();
            System.out.println(st1);
        }catch(IOException|ClassNotFoundException ex){
            System.out.println(ex);
        }
        
        
    }
    
}
