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
public class Leon extends Animal implements Ruido{

    @Override
    public String hacer_ruido() {
       return"wraaaaa"+getNombre();
    }
    
    
}