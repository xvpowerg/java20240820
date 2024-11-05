/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20241105.Ch19_6_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch19_6 {

    static boolean testName(Student st1){
        Optional<String> nameOp = st1.getName();
        if (nameOp.isPresent()&& nameOp.get().length() >= 3){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       Student st1 = new Student();
       st1.setName("Ken");
       boolean t1 = testName(st1);
       System.out.println(t1);
    }
    
}
