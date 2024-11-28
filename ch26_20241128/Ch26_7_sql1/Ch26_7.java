/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20241128.Ch26_7_sql1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Ch26_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20241128";
        String user = "qwer";
        String password = "123456";
       try(Connection conn=  DriverManager.getConnection(url, user, password);
           Statement st = conn.createStatement();){
           
           st.executeUpdate("INSERT INTO student(id,name,score) VALUES(101,'Iris',99.5)");
       }catch(Exception ex){
           System.out.println(ex);
       }
    }
    
}
