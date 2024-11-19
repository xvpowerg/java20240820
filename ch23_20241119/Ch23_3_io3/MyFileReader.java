/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20241119.Ch23_3_io3;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileReader extends InputStreamReader{
    public MyFileReader(String path,String code)
            throws FileNotFoundException,UnsupportedEncodingException{
        super(new FileInputStream(path),code);
    }
    
    public MyFileReader(String path) throws FileNotFoundException,UnsupportedEncodingException{
        this(path,"utf8");
    }
}
