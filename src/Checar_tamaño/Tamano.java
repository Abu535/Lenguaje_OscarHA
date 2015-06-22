/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checar_tamaño;

/**
 *
 * @author Ozkhar
 */
public class Tamano {
    public static void Tamano(int tamano) throws ValidarException{
        if((tamano<4)||(tamano>10)) throw new ValidarException();
    }
}
