/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecepcion;

/**
 *
 * @author T-107
 */
public class probar_Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //primetra ecepxion AritmeticEception
        float a=5;
       int b=0;
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        //Segunda exepcion NomberFormatEception 
        Integer i=new Integer("5");
        int otro=5;
        System.out.println(i+otro);
        //tercer ecepxion ArrayIndexOutofBoundsExeption
        int[]m={2,5,6,7};
        System.out.println(m[4]);
    }
    
}
