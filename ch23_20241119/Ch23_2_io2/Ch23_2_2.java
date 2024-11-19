/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_2_io2;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_2_2 {

    public static void main(String[] args) {
        File textF = new File("C:\\mydir\\msg.txt");
        try( FileInputStream fstr = new FileInputStream(textF);
             InputStreamReader iread = new InputStreamReader(fstr,"big5")){
             int data = -1;
            while((data = iread.read()) != -1 ){
                System.out.print((char)data);
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
     
    } 
    
}
