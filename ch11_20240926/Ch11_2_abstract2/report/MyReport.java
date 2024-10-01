/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240926.Ch11_2_abstract2.report;
import ch11_20240926.Ch11_2_abstract2.erp.MyErp;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyReport extends MyErp {
    protected void reportStyle(ArrayList<String> data){
        for(String v  : data){
            System.out.println(v);
        }
    }
}
