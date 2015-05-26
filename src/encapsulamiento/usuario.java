/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author T-107
 */
public class usuario {
   private String nombre;
   private int edad;
public void setNombre(String x){
   nombre=x;
}
public void setEdad(int y){
    edad=y;
}
public String getNombre(){
    return nombre;
}
public int getEdad(){
    return edad;
}
}

