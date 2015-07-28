/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.Calendar;
import java.util.Locale;
import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 *
 * @author T-107
 */
public class Tread_polimorfico implements Runnable {
public static void main(String[]args){
  Runnable r=new Tread_polimorfico();
    Thread t1=new Thread(r);
    t1.start();
}
    @Override
    public void run() {
        while(true){
        try{
            Thread.sleep(1000);
          //vamos a crear un relojito
            Calendar cal=Calendar.getInstance();
            int hora=cal.get(Calendar.HOUR);
            int min=cal.get(Calendar.MINUTE);
            int seg=cal.get(Calendar.SECOND);
            System.out.println(hora+":"+min+":"+seg);
        }catch(Exception ex){
            
        }
        }
    }
    }
    

