/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author T-107
 */
public class Antro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n="juan";
        int ed=20;
        String em="p@p";
        int cp = 07550;
        String municipio = "GAM";
        Direccion d=new Direccion(cp,municipio);
        Usuario_1 u=new Usuario_1(n,ed,em,d);
       System.out.println(u.getDireccion().getMunicipio());
       System.out.println(u.getDireccion().getCp());
       System.out.println(u.getEdad());
       System.out.println(u.getEmail());
       System.out.println(u.getNombre());
       Bebidas b=new Bebidas();
       b.setTipo("alcohol");
       String reco[]=b.recomendacion();
       for(String be:reco){
           System.out.println(be);
       }
   }
    
}
