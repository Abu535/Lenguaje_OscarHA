/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class Fin_cuatri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //Creamos un pbjeto de tipo Examen parcial
        
        Examen_parcial ep=new Examen_parcial();
        ep.setCalificacion(4);
        ep.setPorcentaje(0.4f);
        Examen_final ef=new Examen_final();
        ef.setCalificacion(8);
        ef.setPorcentaje(0.6f);
        Modelo_evaluacion mo=new Modelo_evaluacion();
        try {
            System.out.println(mo.evaluar(ep, ef));
        } catch (Validar_porcentaje ex) {
            Logger.getLogger(Fin_cuatri.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            
        
    }
    
}
