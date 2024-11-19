/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_7_io7;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ken");
        list.add("Lucy");
        list.add("Joy");
        File f = new File("C:\\mydir\\list.obj");
      try( FileOutputStream fout = new FileOutputStream(f);
              ObjectOutputStream objOut = new ObjectOutputStream(fout);){
         objOut.writeObject(list);
      }catch(Exception ex){
          System.out.println(ex);
      }
    }
    
}
