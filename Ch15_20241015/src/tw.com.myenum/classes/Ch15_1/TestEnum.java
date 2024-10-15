/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ch15_1;


public class TestEnum {
    public enum Action{
        PLAY,
        STOP,
        EXIT
    }
    public static final int PLAY = 8772;
  
     public void testRunEnum(Action action){
              
        switch(action){
            case PLAY:
                System.out.println("Play");
            break;
            case STOP:
                System.out.println("Stop");
                break;
            case EXIT:
                System.out.println("Exit");
                break;    
        }
     }
    
    public void testRun(int action){
        
        switch(action){
            case PLAY:
                System.out.println("Play");
            break;
            case 66444:
                System.out.println("Stop");
                break;
            case 123123:
                System.out.println("Exit");
                break;    
        }
        
    }
    
    
}
