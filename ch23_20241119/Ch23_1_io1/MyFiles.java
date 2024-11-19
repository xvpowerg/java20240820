/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20241119.Ch23_1_io1;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public class MyFiles {
    public static boolean copy(String src,String target)throws IOException{
        File srcFile = new  File(src);
        File targetFile = new  File(target);
        try(FileInputStream fin = new FileInputStream(srcFile);
            FileOutputStream fOut = new  FileOutputStream(targetFile); ){
            int index = -1;
            byte[] buffer = new byte[2048];
            while( (index = fin.read(buffer)) != -1 ){
                fOut.write(buffer,0,index);
            }            
        }catch(Exception ex){
            if (ex instanceof IOException){
                throw ex;
            }
            return false;
        }
        
        return true;
    }
}
