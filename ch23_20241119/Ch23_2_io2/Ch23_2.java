/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_2_io2;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch23_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File textF = new File("C:\\mydir\\msg.txt");
       try(FileReader fr = new FileReader(textF);){
           int data = -1;
           while((data = fr.read()) != -1){
               System.out.print((char)data);
           }
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }

    }
    
}
