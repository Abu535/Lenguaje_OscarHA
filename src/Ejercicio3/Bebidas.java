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
public class Bebidas {
    private String tipo;
    private String[]bebidas;
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
    public String[]recomendacion(){
        if(tipo.equals("alcohol")){
        String[]alcohol={"ron","bodca","tequila","cervesa","vino"};
        /* bebidas[0]="vino";
        bebidas[1]="Bodca";
        bebidas[2]="Ron";
        bebidas[3]="Tequila";
        bebidas[4]="Cervesa";*/
       return alcohol;
        }
        else{
        String[]sinalchol={"agua","cocacola","pepsi","peñafiel","Red-bull"};
        return sinalchol;
        }
    }

}
