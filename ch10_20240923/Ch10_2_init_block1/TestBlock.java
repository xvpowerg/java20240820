/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240923.Ch10_2_init_block1;

/**
 *
 * @author xvpow
 */
public class TestBlock {
    private String[] strArray = new String[100];
    private int count ;
   //初始化所有屬性內容
    {
        for(int i =0; i <strArray.length;i++){
            strArray[i] = "Empty";
        }
    
    }
    
    TestBlock(){
  
    }
    
    TestBlock(int count){
        this.count = count;
    }
    
    public String getMsg(int i){
        //預設填入Empty
        return strArray[i];
    }
    
    public int getCount(){
        return this.count;
    }
}
