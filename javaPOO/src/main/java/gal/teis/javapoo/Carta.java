/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.javapoo;

/**
 *
 * @author lpwil
 */
public class Carta {
    
    //ATRIBUTOS PRIVADOS
   private int numero;
   private String palo;
   
   //CONSTANTE
   public static final String[] PALOS={"Copas","Trebol", "Picas","Oros"};

   //CONSTRUCTOR
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    //USAMOS EL TOSTRING PARA DEVOLVER EL NUMERO Y EL PALO DE LA CARTA
    @Override
    public String toString() {
        return  "numero=" + numero + ", palo=" + palo;
    }
   
   
}
