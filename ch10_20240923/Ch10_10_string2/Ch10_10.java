/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240923.Ch10_10_string2;

/**
 *
 * @author xvpow
 */
public class Ch10_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "ABCDE";
        System.out.println(str1.toLowerCase());
        
        int index = str1.indexOf("C");
        System.out.println(index);
        index = str1.indexOf("G");
        System.out.println(index);
        
        String search = "C";
        //找不到
        //找到了
        if (str1.indexOf(search) > -1){
            System.out.println("找到了");
        }else{
            System.out.println("找不到");
        }
        
        
    }
    
}
