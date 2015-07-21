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
import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.*;
public class Modelopercistenciaanimal {
    public void guardar(Animal animal) throws Exception{
        //paso 1 crear el archivo dodne se guardara el animal
        File file=new File("D:\\Nueva carpeta/animales.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(animal);
        System.out.println("Animal comprimido con exito");
        
    }
    
}
