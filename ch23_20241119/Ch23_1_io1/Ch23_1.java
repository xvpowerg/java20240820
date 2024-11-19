/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_1_io1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Ch23_1 {
    //MyFiles
    //有一個函數稱為copy
    //可傳2參數 1 src 2 target
    //成功回傳true 失敗回傳false 可拋出IOException
    public static void main(String[] args) {
      File src = new File("C:\\mydir\\netbeans-23-source.zip");  
      File target = new File("C:\\mydir\\netbeans-23-source_copy.zip");
      
      try(FileInputStream fin = new FileInputStream(src);
          FileOutputStream fout = new  FileOutputStream(target);   ){
          int index = -1;
          byte[] buffer = new byte[2048];
          while( (index = fin.read(buffer)) != -1){
              fout.write(buffer, 0, index);
            }
      }catch(FileNotFoundException ex){
          System.out.println(ex);
      }catch(IOException ex){
          System.out.println(ex);
      }
    }
    
}
