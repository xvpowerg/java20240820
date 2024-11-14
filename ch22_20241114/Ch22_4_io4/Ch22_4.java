/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20241114.Ch22_4_io4;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          File fiIn = new File("c:\\mydir\\netbeans-23-source.zip");
         File fiOut = new File("c:\\mydir\\netbeans-23-source-cp.zip"); 

        try(InputStream fin = new BufferedInputStream(new FileInputStream(fiIn));   
             OutputStream fout  = new BufferedOutputStream(new FileOutputStream(fiOut));){             
            int data = -1;
            while((data = fin.read()) != -1){
                fout.write(data);
            }
        }catch(FileNotFoundException ex){
                System.out.println(ex);
        }catch(IOException ex){
              System.out.println(ex);
        }
            
            
        
        
    }
    
}
