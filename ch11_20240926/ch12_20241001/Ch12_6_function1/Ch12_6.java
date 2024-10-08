/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20241001.Ch12_6_function1;

/**
 *
 * @author xvpow
 */
public class Ch12_6 {
    static void foreachData(Iterator it,MyConsumer com){
        it.foreach(com);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       Student st1 = new Student("Ken");
       PrintSrudentScore ps = new PrintSrudentScore();
       st1.addScore(65);
       st1.addScore(77);
       st1.addScore(85);
       foreachData(st1,ps);
       
       //java 必須記的FunctionalInterface
       /*
        Consumer void accept​(T t)
        Supplier T  get()
       
        Function<T,​R> R apply​(T t)
        UnaryOperator<T> T apply​(T t)
       
        Predicate<T> boolean  test​(T t)
       
       
       */
    
    }
    
}
