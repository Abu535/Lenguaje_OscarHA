/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.Calendar;

/**
 *
 * @author T-107
 */
public class Relojito_mejorado {
    public static void main(String[]args){
        //Aqui veremos la forma de crear un Thread usando la clses internas anonimas
        Thread t1=new Thread(new Runnable() {

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
        });
        t1.start();
    }
    
}
