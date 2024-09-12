/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240912.Ch8_5_exception1;

/**
 *
 * @author xvpow
 */
public class Ch8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        try{
               Student st1  = new Student("Vivin",2);
                 System.out.println(st1.getName()+
                ":"+st1.getAge());
        }catch(RuntimeException ex){
            System.out.println(ex);
        }
      
       
        System.out.println("End!!!");
    }
    
}
