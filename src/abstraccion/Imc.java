/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class Imc {
   private float pso;
    private float alt;
   
    public void setPso(float x){
        this.pso=x;
    }
    public void setAlt(float y){
        this.alt=y;
    }
     public float getPso(){
        return pso;
    }
    public float getAlt(){
        return alt;
    }
    public Imc(float p , float a){
      pso=p;
      alt=a;
    }
    public String calcular(){
        float imc=pso/(alt*alt);
        return "Tu imc es : "+imc;
    }
   
    public Imc(){
        
    }
}
