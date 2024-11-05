/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20241105.Ch19_7_option2;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch19_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        String value = "Vivin";
        //Optional<String> opt1 =  Optional.of(value);//不支持null
        Optional<String> opt2 =  Optional.ofNullable(value);//支持null
        String value2 = "Iris";
        Optional<String> opt3 =  Optional.ofNullable(value2);
        if (opt3.isPresent()){
            System.out.println(opt3.get());
        }
        opt3.ifPresent(v->System.out.println("ifPresent:"+v));
       
        String value3 = null;
        Optional<String> opt4 =  Optional.ofNullable(value3);
      String x1 =  opt4.orElse("Default");
      String x2 =  opt4.orElseGet(()->"Default");
      String x3 =  opt4.orElseThrow();
      String x4 = opt4.orElseThrow(RuntimeException::new);
      System.out.println(x1+":"+x2+":"+x3+":"+x4);
    }
    
}
