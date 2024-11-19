/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_3_io3;

/**
 *
 * @author xvpow
 */
public class Ch23_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String path = "C:\\mydir\\msg.txt";
       //可傳入編碼
       //預設是utf-8
       try(MyFileReader reader = new MyFileReader(path,"big5");){
            int data= -1;
            
            while( (data = reader.read()) != -1){                
                
                System.out.print((char)data);
            }
           
           
       }catch(Exception ex){
           System.out.println(ex);
       }
    }
    
}
