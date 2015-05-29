/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfaceImc {
    public static void main(String[]oso){
       //Imc imc=new Imc(80,1.67f);
       Imc imc1=new Imc();
       imc1.setPso(10f);
       imc1.setAlt(5f);
        System.out.println(imc1.calcular()); 
    }
    //primitivos integrales
    byte b;
    short s;
    int i;
    long l; 

}
