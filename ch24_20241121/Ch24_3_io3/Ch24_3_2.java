/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20241121.Ch24_3_io3;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ch24_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        File f1 = new File("C:\\mydir\\item.obj");
        try(FileInputStream fin = new FileInputStream(f1);
            ObjectInputStream objIn =  new  ObjectInputStream(fin)  ){
            Item item = (Item) objIn.readObject();
            System.out.println(item);
        }
        
        
    }
    
}
