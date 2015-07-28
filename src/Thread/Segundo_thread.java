/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author T-107
 */
public class Segundo_thread extends Thread {
    public void run(){
        while(true){
       try{
          Thread.sleep(1000);
           System.out.println("Yo soy el segundo thread");
       }
       catch (InterruptedException e){
    
}
        }
    }
    
}
