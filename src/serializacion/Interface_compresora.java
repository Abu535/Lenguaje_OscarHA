/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class Interface_compresora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primero creamos un animla
        Animal a=new Animal();
        a.setNombre("Leon");
        a.setCanivoro(true);
        Modelopercistenciaanimal modelo=new Modelopercistenciaanimal();
        try {
            modelo.guardar(a);
        } catch (Exception ex) {
            Logger.getLogger(Interface_compresora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
