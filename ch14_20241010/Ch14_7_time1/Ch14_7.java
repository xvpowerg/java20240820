/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20241010.Ch14_7_time1;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Ch14_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
        LocalDate date = LocalDate.now();
        System.out.println(date.getYear()+"/"+date.getMonthValue()+
                "/"+date.getDayOfMonth());
        
        LocalDateTime dateTime =  LocalDateTime.now();
        System.out.println(dateTime);
        LocalDate date2 = LocalDate.of(2024, 10, 5);
        System.out.println(date2);
        
        LocalDate date3 = LocalDate.parse("2024-10-03");
        System.out.println(date3);
       DateTimeFormatter df =  DateTimeFormatter.ofPattern("yyyy/MM/dd");
       
         LocalDate date4 = LocalDate.parse("2024/10/03",df);
           System.out.println(date4);
    }
    
}
