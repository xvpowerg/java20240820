/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240827;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {
    public static void main(String[] args) {
       int [] array1 = {75,66,90,82};
        int sum = 0;
        for (int s : array1){
            sum += s;
        }
        System.out.println("Sum:"+sum);
        System.out.println("Avg:"+(sum/array1.length));
        //找最大值
        //找最小值
        var max = array1[0];//75
        var min = array1[0];//75
        for (var v : array1){
            if (v > max) max = v;
            if (v < min) min = v;            
        }
        System.out.println("max:"+max );
        System.out.println("min:"+min );
    }
    
}
