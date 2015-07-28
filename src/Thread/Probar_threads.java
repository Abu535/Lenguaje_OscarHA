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
public class Probar_threads {
    
    public static void main(String[]args){
        //Paso 1 creamos el thread
        Primer_thread t1=new Primer_thread();
        Segundo_thread t2=new Segundo_thread();
        Tercer_thread t3=new Tercer_thread();
        //paso 2 lo ponemos en estado inicializado
        t1.start();
        t2.start();
        t3.start();
        //paso 3 y 4 vienen dados por metodo run
    }
    
}
