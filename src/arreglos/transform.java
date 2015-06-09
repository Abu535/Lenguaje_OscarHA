/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-107
 */
public class transform {
    byte[]al;
    public transform(String a){
      al=a.getBytes();
        
    }
     public String transformar1(){
StringBuilder builder=new StringBuilder();
for (byte c:al){
     builder.append(c);
     builder.append(" ");
}
return builder.toString();

        }
     public String retansformar(){
         StringBuilder builder=new StringBuilder();
for (byte c:al){
     builder.append((char)(c));
}
         return builder.toString();
    
}
     
     }
   

