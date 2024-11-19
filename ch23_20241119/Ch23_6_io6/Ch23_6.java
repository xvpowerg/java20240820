/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_6_io6;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Ch23_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File save = new File("C:\\mydir\\save.obj");
       try(FileInputStream fIn = new FileInputStream(save);
        ObjectInputStream objIn = new ObjectInputStream(fIn);){
           String msg = (String)objIn.readObject();
           System.out.println(msg);
       }catch(FileNotFoundException | ClassNotFoundException ex){
           System.out.println(ex); 
       }catch(IOException ex){
            System.out.println(ex); 
       }
    }
    
}
