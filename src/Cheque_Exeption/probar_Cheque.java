/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cheque_Exeption;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class probar_Cheque {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
    File f=new File("archivo");
        try {
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
           
        }
        catch (Exception e){
            
        }
    
}
}