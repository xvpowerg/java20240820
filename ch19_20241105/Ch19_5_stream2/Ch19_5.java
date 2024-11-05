/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20241105.Ch19_5_stream2;
import java.util.stream.Stream;
import java.util.Random;
public class Ch19_5 {

   
    public static void main(String[] args) {
       
        Stream<Integer> st1 = Stream.of(5,6,7,10);
        st1.forEach(v->System.out.println(v));
        //   Stream只能使用一次     
        //st1.forEach(v->System.out.println(v));
       Stream<Integer> st2 =  Stream.generate(()->{Random r = new Random(); 
                            return r.nextInt();});
       st2.limit(10).forEach(v->System.out.println(v));
        
    }
    
}
