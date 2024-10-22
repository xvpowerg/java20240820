/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20241022.Ch16_4_list3;
import java.util.ArrayList;
public class Ch16_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list = new ArrayList();
        list.add(10);        
        list.add("Ken");
        list.add(18);
        list.add("Iris");
        
        for (Object obj : list){
            if (obj instanceof Number){
                System.out.println(obj+"數字");
            }else if (obj instanceof String){
                System.out.println(obj+"字串");
            }
            
        }
        
    }
    
}
