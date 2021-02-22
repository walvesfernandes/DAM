/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.proyectopaises;

import gal.teis.libreriadam.ControlData;
import gal.teis.libreriadam.Menu;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal {

    //para que pueda utilizarse en el método que pinta el menú
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Defino un objeto para almacenar el pais
        Pais elPais = null;

        //Inicializo variables que se pueden necesitar para crear un ojeto pais
        String nombrePais = "", capitalPais = "";
        byte republica = 0;
        int numHabitantes = 0;

        //Variables auxiliares;
        byte caracter = 0;

        //Variable para finalizar el menú;
        boolean finalizar = false;

        switch (pintarMenuCrearObjeto()) {
            case 1:
                System.out.println("Introduce el nombre del país");
                nombrePais = ControlData.lerNome(sc);
                elPais = new Pais(nombrePais);
                break;
            case 2:
                System.out.println("Introduce el nombre del país");
                nombrePais = ControlData.lerNome(sc);
                System.out.println("Introduce la capital de " + nombrePais);
                capitalPais = ControlData.lerNome(sc);
                elPais = new Pais(nombrePais, capitalPais);
                break;
            case 3:
                System.out.println("Introduce el nombre del país");
                nombrePais = ControlData.lerNome(sc);
                System.out.println("Introduce la capital de " + nombrePais);
                capitalPais = ControlData.lerNome(sc);
                System.out.println("Indica si " + nombrePais + " es una república (1) o una monarquía (2)");
                caracter = ControlData.lerByte(sc);
                if (caracter == 1) {
                    republica = 1;
                } else {
                    republica = 2;
                }

                elPais = new Pais(nombrePais, capitalPais, republica);
                break;
        }

        do {

            switch (pintarMenu()) {
                case 1 -> {
                    System.out.println("Introduce el nombre del país");
                    nombrePais = ControlData.lerNome(sc);
                    elPais.setNombre(nombrePais);
                }
                case 2 -> {
                    System.out.println("Introduce la capital de " + nombrePais);
                    capitalPais = ControlData.lerNome(sc);
                    elPais.setCapital(capitalPais);
                }
                case 3 -> {
                    System.out.println("Indica si " + nombrePais + " es una república (1) o una monarquía (2)");
                    caracter = ControlData.lerByte(sc);
                    if (caracter == 1) {
                        republica = 1;
                    } else {
                        republica = 2;
                    }

                    elPais.setRepublica(republica);
                }
                case 4 -> {
                    System.out.println("Introduce el nº de habitantes de " + nombrePais);
                    numHabitantes = ControlData.lerInt(sc);
                    elPais.setNumHabitantes(numHabitantes);
                }
                case 5 -> {
                    System.out.println("Indica el número de lenguas que se hablan en el país");
                    int numeroLenguas = ControlData.lerByte(sc);
                    String[] lenguas = new String[numeroLenguas];
                    for (int i = 0; i < numeroLenguas; i++) {
                        System.out.println("Introduce el idioma nº " + (i + 1));
                        lenguas[i] = ControlData.lerNome(sc);
                    }
                    elPais.setLenguas(lenguas);
                }
                case 6 -> System.out.println(elPais.verDatosPais());
                case 7 -> System.out.println("Paises creado:" + elPais.getContador());
                case 8 -> {
                    System.out.println("Hasta otra!!!");
                    finalizar = true;
                }
            }
        } while (!finalizar);
    }

    /**
     * Dibuja un menú en la consola a partir con unas opciones determinadas
     */
    static byte pintarMenuCrearObjeto() {
        byte opcion;
        boolean correcta;
        System.out.println("\n\n*******************************************************************************************************");
        /* Solo sale del While cuando se selecciona una opción correcta en rango y tipo*/
        do {

            ArrayList<String> misOpciones = new ArrayList<String>();
            misOpciones.add("Crear país aportando el nombre");
            misOpciones.add("Crear país aportando el nombre y la capital");
            misOpciones.add("Crear país aportando el nombre, la capital y el sistema de gobierno");

            /*La clase Menu permite imprimir el menú a partir de los datos de un ArrayList<String>
            y utilizar métodos para control de rango*/
            Menu miMenu = new Menu(misOpciones);
            miMenu.printMenu();

            /*La clase ControlData permite hacer un control de tipo leído*/
            opcion = ControlData.lerByte(sc);
            correcta = miMenu.rango(opcion);

        } while (!correcta);

        return opcion;
    }

    static byte pintarMenu() {
        byte opcion;
        boolean correcta;
        System.out.println("\n\n*******************************************************************************************************");
        /* Solo sale del While cuando se selecciona una opción correcta en rango y tipo*/
        do {
            ArrayList<String> misOpciones = new ArrayList<String>();
            misOpciones.add("Editar nombre pais");
            misOpciones.add("Editar la capital del pais");
            misOpciones.add("Editar el sistema de gobierno del pais");
            misOpciones.add("Editar número de habitantes que tiene el pais");
            misOpciones.add("Editar las lenguas que se hablan en el país");
            misOpciones.add("Mostrar datos del pais creado");
            misOpciones.add("Paises creado");
            misOpciones.add("Finalizar");

            /*La clase Menu permite imprimir el menú a partir de los datos de un ArrayList<String>
            y utilizar métodos para control de rango*/
            Menu miMenu = new Menu(misOpciones);
            miMenu.printMenu();

            /*La clase ControlData permite hacer un control de tipo leído*/
            opcion = ControlData.lerByte(sc);
            correcta = miMenu.rango(opcion);

        } while (!correcta);

        return opcion;
    }
}
