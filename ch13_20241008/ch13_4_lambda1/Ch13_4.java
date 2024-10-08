/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20241008.ch13_4_lambda1;
import java.util.function.Function;
public class Ch13_4 {

     static Integer stringToInteger(Function<String,Integer> fun,String data){
         return fun.apply(data);
     }
 
    public static void main(String[] args) {
      Function<String,Integer> myFunc =   new Function<String,Integer>(){
           public Integer apply(String data){
               return data.length();
           }
       };
        
       int len = stringToInteger(myFunc,"ABCDE");
       System.out.println(len);
       
      int number =  stringToInteger((String str)->{return Integer.parseInt(str);},
                        "12345");
      System.out.println(number);
    }
    
}
