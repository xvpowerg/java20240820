/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240926.Ch11_2_abstract2.erp;
import java.util.ArrayList;
//abstract 類別也不可final
public abstract class MyErp {
    private ArrayList readData(){
     ArrayList<String> data = 
             new ArrayList<>();
     data.add("Ken:900");
     data.add("Iris:560");
     data.add("Vivin:750");
     return data;
    }
    //abstract方法不能是final
    protected abstract void reportStyle(ArrayList<String> data);
    
    public final void exportReport(){
       ArrayList<String> data =  readData();
       reportStyle(data);
    }
}
