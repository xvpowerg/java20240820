/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20241126.Ch25_8_locale;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 *
 * @author xvpow
 */
public class Ch25_8 {
    public static void main(String[] args) {
        Locale enLocale = new Locale("en","US");
        Locale zhLocale = new Locale("zn","TW");
        
        ResourceBundle budle1 = ResourceBundle.getBundle("messages",zhLocale);
        String msg1_1 = budle1.getString("greeting");
        String msg1_2 =  budle1.getString("number_format");
        System.out.println(MessageFormat.format(msg1_1, "小民"));
        System.out.println(MessageFormat.format(msg1_2, 17));
        
        
        ResourceBundle budle2 = ResourceBundle.getBundle("messages",enLocale );
        String msg2_1 = budle2.getString("greeting");
        String msg2_2 =  budle2.getString("number_format");
        System.out.println(MessageFormat.format(msg2_1, "John"));
        System.out.println(MessageFormat.format(msg2_2, 88));
    }
    
}
