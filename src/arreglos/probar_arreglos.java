/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-107
 */
public class probar_arreglos {

    /**+
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x[]={1,45,-12,7};
      
       int y[]=new int[3];
       y[0]=34;
       y[1]=12;
       y[2]=45;
       
       int z[]=new int[]{3,-12,9};
       
       String h="hola";
       
       for (int i=0;i<x.length;i++){
           System.out.println("El elemento tiene un vlor de "+x[i]);
       }
       for (int m:x){
           System.out.println("El elemento tiene un vlor de "+m);
       }
        byte[]al=h.getBytes();
       
        for (byte e:al){
           System.out.println("El elemento tiene un vlor de "+(char)e);
       }
    }
    
}
