/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20241128.Ch26_8_sql2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author xvpow
 */
public class Ch26_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String url = "jdbc:derby://localhost:1527/mydb20241128";
        String user = "qwer";
        String password = "123456";
       try(Connection conn=  DriverManager.getConnection(url, user, password);
           Statement st = conn.createStatement();){           
           ResultSet result = st.executeQuery("SELECT * FROM student");
           while(result.next()){
               int id = result.getInt(1);
               String name = result.getString("name");
               double score = result.getDouble(3);
               System.out.println(id+":"+name+":"+score);
               
           }
           
       }catch(Exception ex){
           System.out.println(ex);
       }
    }
    
}
