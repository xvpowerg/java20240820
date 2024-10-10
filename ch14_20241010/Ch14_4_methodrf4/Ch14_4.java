/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20241010.Ch14_4_methodrf4;
import java.util.function.UnaryOperator;

public class Ch14_4 {
    
    static String strToStr(UnaryOperator<String> op,String data){
        return op.apply(data);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String d1 = "ABC";
        String lower = strToStr(String::toLowerCase,d1);
        System.out.println(lower);
    }
    
}
