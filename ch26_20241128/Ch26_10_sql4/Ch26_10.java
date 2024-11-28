/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20241128.Ch26_10_sql4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author xvpow
 */
public class Ch26_10 {
      public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20241128";
        String user = "qwer";
        String password = "123456";
        try(Connection conn=  DriverManager.getConnection(url, user, password);){
              try(Statement st = conn.createStatement();){
                    conn.setAutoCommit(false);
                    st.executeUpdate("INSERT INTO student(id,name,score) VALUES(301,'Iris',99.5)");
                    st.executeUpdate("INSERT INTO student(id,name,score) VALUES(302,'Vivin',99.5)");
                    st.executeUpdate("INSERT INTO student(id,name,score) VALUES(302,'Lucy',99.5)");
                    conn.setAutoCommit(true);
                }catch(Exception ex){
                    conn.rollback();
                    System.out.println(ex);
                }
        }catch(Exception ex){
            System.out.println(ex);
        }
     
    }
    
}