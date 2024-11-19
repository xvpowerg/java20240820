/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_7_io7;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File f = new File("C:\\mydir\\list.obj");
      try( FileInputStream fin = new FileInputStream(f);
              ObjectInputStream objIn = new ObjectInputStream(fin);){
        ArrayList list = (ArrayList)  objIn.readObject();
        System.out.println(list);
      }catch(Exception ex){
          System.out.println(ex);
      }
    }
    
}
