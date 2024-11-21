/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20241121.Ch24_2_io2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Ch24_2 {

   
    public static void main(String[] args) {
       Student st1 = new Student("Joy",36,156,51);
       //System.out.println(st1);
       File f1 = new File("C:\\mydir\\student2.obj");
       try(FileOutputStream fout = new FileOutputStream(f1);
            ObjectOutputStream objOut = new   ObjectOutputStream(fout); ){
           objOut.writeObject(st1);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
