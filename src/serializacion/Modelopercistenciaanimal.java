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
import java.util.ArrayList;
public class Modelopercistenciaanimal {
    String ruta="D:\\Nueva carpeta\\animales.xxx";
    ArrayList<Animal> animales;

    public Modelopercistenciaanimal() {
        this.animales =new ArrayList<Animal>();
    }
    public void guardar(Animal animal) throws Exception{
        //paso 1 crear el archivo dodne se guardara el animal
        File file=new File(ruta);
        FileOutputStream fos=new FileOutputStream(file);
        if (file.exists()){
          animales=buscarTodos();
        }
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        animales.add(animal);
        oos.writeObject(animales);
        System.out.println("Animal comprimido con exito");
        
    }
    public ArrayList<Animal> buscarTodos()throws Exception{

        File f=new File(ruta);
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        animales=(ArrayList<Animal>)ois.readObject();
        return animales;
    }
}
