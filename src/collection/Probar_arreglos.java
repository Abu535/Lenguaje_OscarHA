/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;
import java.util.*;
/**
 *
 * @author T-107
 */
public class Probar_arreglos {
    public static void main(String[]args){
        Generador_usuario gene=new Generador_usuario();
        gene.agregarUsuario("petro", 15, "chimichanga");
       ArrayList<Usuario> usuario= (ArrayList<Usuario>)gene.getUsuario();
        System.out.println(usuario.size()); 
        for(Usuario u:usuario){
            System.out.println(u.getNombre());
        }
    }
    
}
