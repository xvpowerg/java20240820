/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20241119.Ch23_1_io1;

/**
 *
 * @author xvpow
 */
public class Ch23_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String src = "C:\\mydir\\netbeans-23-source.zip";  
        String target = "C:\\mydir\\netbeans-23-source_copy.zip";
        try{
            boolean b = MyFiles.copy(src, target);
            System.out.println(b);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
