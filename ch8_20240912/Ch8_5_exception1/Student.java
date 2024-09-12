/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240912.Ch8_5_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
   private String  name;
   private int age;//8~15 之間 小於或超過都會顯示錯誤的年齡
   public Student(String name,int age){
       this.setName(name);
       this.setAge(age);
   }
   public String getName(){
       return this.name;
   }
   public void setName(String name){
       this.name = name;
   }
   
   public int getAge(){
       return this.age;
   }
   public void setAge(int age){
       if (age < 8 || age > 15){
           //System.out.println("錯誤的年齡");
           
           throw new RuntimeException("錯誤的年齡");
       }
       this.age = age;
   }
}
