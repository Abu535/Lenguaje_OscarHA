/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pollo p1=new Pollo();
                p1.setNombre("pollito pio");
                
        Leon  l1=new Leon();
                l1.setNombre("simba");
                
        Leon  l2=new Leon();
               l2.setNombre("Mufasa");
                
        Delfin d1=new Delfin();        
               d1.setNombre("Flipper");
       //para hacer el ciclo for se crea un arreglo
       
               Ruido animales[]=new Ruido[4];
       //inicializar al primer lugar p1, elemento 0, se esta haciendo un casting, el arreglo es polimorfico
       animales[0]=p1;
       animales[1]=l1;
       animales[2]=l2;
       animales[3]=d1;
       // interface se invocara el metodo hacer ruido
       for(Ruido algo:animales){
           //se invoca al subtipo animales 
           // no hemos usado la herencia, para imprimir el nombre tenemos que poner el getNombre en las clases de los animales
          // ya que la heredan los animales de la interface Animal
       System.out.print(algo.hacer_ruido());           
       }
    }
    
}
