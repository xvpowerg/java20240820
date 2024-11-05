/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20241105.Ch19_3_generics2;
import java.util.ArrayList;

public class Ch19_3 {
    
    static void test1(ArrayList<Test2> list){
        System.out.println(list);
    }
    static void test2(ArrayList<? extends Test2> list){
        //list.add(new Test2());//不可新增 只能讀
        for (Test2 t2 :list ){
            System.out.println(t2);
        }
    }
    
    static void test3(ArrayList<? super Test3> list){
        list.add(new Test3()); //只能是Test3的類型      
        for (Object t3 : list){
            System.out.println(t3);
        }
    }
    public static void main(String[] args) {
        
        ArrayList<Test2> listTest2 = new ArrayList();
        listTest2.add(new Test2());
        listTest2.add(new Test3());
        test1(listTest2);
        //一般泛型不支持多形
        ArrayList<Test3> listTest3 = new ArrayList();
        listTest3.add(new Test3());
        listTest3.add(new Test3());
        test2(listTest3);
        ArrayList<Test1> listTest1 = new ArrayList();
        ArrayList<Test2> listTest2_1 = new ArrayList();
        ArrayList<Test4> listTest4 = new ArrayList();
        test3(listTest1);
        test3(listTest2_1);
        //test3(listTest4);
    }
    
}
