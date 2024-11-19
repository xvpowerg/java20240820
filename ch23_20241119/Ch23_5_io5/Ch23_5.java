/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_5_io5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File save = new File("C:\\mydir\\save.obj");
       String msg = "Ken";
       try(FileOutputStream fout = new FileOutputStream(save);
            ObjectOutputStream objOut = new ObjectOutputStream(fout);   ){
           
           objOut.writeObject(msg);
           
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
            System.out.println(ex);
       }
    }
    
}
