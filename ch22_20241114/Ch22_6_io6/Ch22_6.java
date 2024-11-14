/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20241114.Ch22_6_io6;

/**
 *
 * @author xvpow
 */
public class Ch22_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(TestClose1 t1 = new TestClose1("A1",false);
            TestClose1 t2 = new TestClose1("A2",true);){
            throw new Exception("Body!");
        }catch(Exception ex){
            Throwable[] throwList =  ex.getSuppressed();
            
            for (Throwable t : throwList){
                System.out.println(t);
            }
            
            System.out.println(ex);
        }
      
    }
    
}
