/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author T-107
 */
public class probar_todo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test1 objeyo1=new test1(10);
        test1 objeyo2=new test1();
        
        JFrame ventana=new JFrame("Mi primer ventana");//creador de ventanas
        ventana.setSize(400,400);
        ventana.setVisible(true);
    }
    
}
