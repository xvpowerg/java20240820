/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20241121.Ch24_1_io1;
import java.io.FileOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken",25);
        //System.out.println(st1);
        File f1 = new File("C:\\mydir\\student.obj");
        try(FileOutputStream fin = new FileOutputStream(f1);
            ObjectOutputStream objOut = new ObjectOutputStream(fin);){
            objOut.writeObject(st1);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
