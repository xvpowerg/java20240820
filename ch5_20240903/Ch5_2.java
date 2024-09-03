/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240903;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {
    //長參數只能是參數的最後一個
    static int searchMax(int v1,int ... values){
        int ans = -1;
        for(var v : values){
            if (v > v1 ){
                   ans = v;
                   v1 = v;
               }        
        }           
        return ans;
    }
    public static void main(String[] args) {
        int ans = searchMax(11,5,7,8,9,16,12);
        System.out.println(ans);
        
    }
    
}
