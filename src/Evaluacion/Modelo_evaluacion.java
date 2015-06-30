/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;

/**
 *
 * @author T-107
 */
public class Modelo_evaluacion {
    public float evaluar(Examen_parcial cparcial,Examen_final cfinal)throws Validar_porcentaje{
         Porcentaje.Prcentaje(cparcial.getPorcentaje(), cfinal.getPorcentaje());
        float calificacion_final=(cparcial.getCalificacion()*cparcial.getPorcentaje())+(cfinal.getCalificacion()*cfinal.getPorcentaje());
       
        return calificacion_final;
       
    }
    
}
