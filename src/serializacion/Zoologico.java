/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author T-107
 */
public class Zoologico {
    public static void main(String[]args)throws Exception{
        Modelopercistenciaanimal m=new Modelopercistenciaanimal();
      Animal a=new Animal();
      a.setNombre("cuyo");
      a.setCanivoro(false);
      m.guardar(a);
      for(Animal aa:m.buscarTodos()){
        System.out.println(aa.getNombre());
        
    }
    
    }
}
