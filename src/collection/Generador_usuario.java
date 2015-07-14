/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class Generador_usuario {
    List<Usuario> usuario;
public Generador_usuario(){
   
    Usuario u1=new Usuario("oscar",21,"p@p");
     Usuario u2=new Usuario("pedor",22,"q@p");
      Usuario u3=new Usuario("juana",23,"w@p");
      Usuario u4=new Usuario("pancha",60,"pancah@p");
      usuario=new ArrayList<Usuario>();
      usuario.add(u1);
      usuario.add(u2);
      usuario.add(u3);
      usuario.add(u4);
}
    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
    public String agregarUsuario(String nombre, int edad, String email){
       Usuario u=new Usuario(nombre,edad,email);
       usuario.add(u);
       return"se a agregado";
    }
}
