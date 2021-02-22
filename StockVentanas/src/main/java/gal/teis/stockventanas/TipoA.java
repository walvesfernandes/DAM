package gal.teis.stockventanas;

import java.util.Arrays;

/**
 *
 * @author lpwil
 */
public class TipoA {

    public static final String material = "Madera";
    public static final int ancho = 100;
    public static final int largo = 115;
    public static final double precio = 149.00;

    public static final String[] COLORES = {"rojo", "verde", "azul", "gris", "blanco"};

    private String color;
    private int contadorA;

    //Setters 
    public String setColor(String color) {
        return color;
    }

    //Getters
    public String getColor(String color) {
        return color;
    }

    public static int getAncho() {
        return ancho;
    }

    public static int getLargo() {
        return largo;
    }

    public int getContadorA() {
        return contadorA;
    }

    //Get que coge una posicion del array y devuelve una string
    public static String getColores(String color) {

        return Arrays.toString(COLORES);
    }

    //Set
    public static String setColores(String color) {

        return Arrays.toString(COLORES);
    }

    //Constructor
    public TipoA(String color) {
        this.color = color;
        contadorA++;
    }

    public TipoA() {
        getColores(color);
    }

    //Metodos
    //Metodo para mostrar las informarciones de las ventanas
    public String infoVentana() {
        this.color = color;
        String info;
        byte i = 0;

        System.out.print("Colores: ");
        //Uso un while para recoger todo el array y mostrar los colores
        while (i != COLORES.length) {

            System.out.print(COLORES[i]);
            //Utilizo el if para poner las comas correctamente
            if (i < COLORES.length - 1) {
                System.out.print(", ");
            }
            i++;
        }
        info = "\nMaterial: " + material
                + "\nAncho: " + ancho
                + "\nLargo: " + largo
                + "\nPrecio: " + precio + "$$";

        return info;
    }

}
