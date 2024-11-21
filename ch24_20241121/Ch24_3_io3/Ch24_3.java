/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20241121.Ch24_3_io3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ch24_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        File f1 = new File("C:\\mydir\\item.obj");
        Item item = new Item("Ken",123);
        try(FileOutputStream fin = new FileOutputStream(f1);
            ObjectOutputStream objOut = new   ObjectOutputStream(fin);  ){
            objOut.writeObject(item);
        }
    }
    
}
