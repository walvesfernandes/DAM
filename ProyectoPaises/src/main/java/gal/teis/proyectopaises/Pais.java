/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.proyectopaises;

import java.util.Objects;

/**
 *
 * @author Esther Ferreiro
 */
public class Pais {

    //Propiedades privadas
    private String nombre;
    private int numHabitantes;
    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    private String capital;
    private String[] lenguas;
    private byte republica;

    //Constructores
    public Pais(String nombre) {
        this.nombre = nombre;
        contador++;
    }

    public Pais(String nombre, String capital) {
        this(nombre);
        this.capital = capital;

    }

    public Pais(String nombre, String capital, byte republica) {
        this(nombre, capital);
        this.republica = republica;

    }

    //Setter y Getter 
    public String getNombre() {
        return nombre;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public String getCapital() {
        return capital;
    }

    public String[] getLenguas() {
        return lenguas;
    }

    public byte isRepublica() {
        return republica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setLenguas(String[] lenguas) {
        this.lenguas = lenguas;
    }

    public void setRepublica(byte republica) {
        this.republica = republica;
    }

    public String verDatosPais() {
        /*Muestra toda la información que tiene almacenada de un pais concreto. 
        En el caso de que no tenga datos en alguna propiedad, muestra el valor 
        por defecto de esa variable
        Esta situació podría modificarse aportando, en los constructores, valores por defecto  
        de las propiedades que no tienen información*/

        String cadena = "El pais: " + nombre + " tiene "
                + numHabitantes
                + " habitantes";

        if (!Objects.isNull(capital) && republica != 0) {
            cadena += " y tiene como capital " + capital + " y su republica es:";
        } else {
            cadena += " aun no tiene capital ";
        }

        //creo un switch para valorar si es republica o no
        switch (republica) {
            case 0 ->
                cadena += " y aun no tiene republica";
            case 1 ->
                cadena += " república";
            case 2 ->
                cadena += " monarquía";
            default -> {
            }
        }

        if (!Objects.isNull(lenguas)) {
            cadena += " y se habla ";
            for (int i = 0; i < lenguas.length; i++) {
                cadena += lenguas[i] + "-";

            }
        }

        return cadena;
    }
}
