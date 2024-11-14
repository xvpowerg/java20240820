/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20241114.Ch22_2_io2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File target = new File("c:\\mydir\\msg.txt");
        File copy = new File("c:\\mydir\\msgcp.txt"); 
        try{
            FileInputStream fin = new FileInputStream(target);
            FileOutputStream fout = new FileOutputStream(copy);
            int data = -1;
            while ((data = fin.read()) != -1){
               // System.out.println(data);
               fout.write(data);
            }
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
