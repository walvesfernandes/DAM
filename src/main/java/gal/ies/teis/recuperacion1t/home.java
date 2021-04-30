/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.ies.teis.recuperacion1t;

import java.util.Scanner;

/**
 *
 * @author willianaf
 */
public class home {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        String palabrasScretas[] = {"agudo", "conducta", "tronco", "funcional", "progresivo"}; //facil
        String palabrasScretas1[] = {"velcro", "trasladar", "hemiplejia", "miembro", "ocupacional"}; // normal
        String palabrasScretas2[] = {"enfermedades", "choquezuela", "hemiplejia", "pantorrilla", "ocupacional"}; // dificil

        String titulo = "\n------------------\nJuego del ahorcado\n------------------\n1-Jugar.\n2-Configurar.\n3-Salir.";

        char charUser;
        boolean salir = false;
        byte opcion = 0; // opciones del menu
        byte vida = 8; //Vidas del jugador
        byte opNivel = 0;
        int contCorrecto = 0; //contador de correctos 
        int cont; // contador de caracteres incorrectos
        int palabraAle = (int) (Math.random() * 5); //rango del array
        int tam;
        String palabra = "";

        //MENU
        do {

            //guarda una palabra aleatoria
            if (opNivel == 2) {
                //si es normal
                palabra = palabrasScretas1[palabraAle];
                vida = 10;
                tam = palabra.length();
            } else if (opNivel == 3) {
                //si es dificil
                palabra = palabrasScretas2[palabraAle];
                vida = 12;
                tam = palabra.length();
            } else {

                palabra = palabrasScretas[palabraAle];
                tam = palabra.length();
            }

            //uso su tamaño para controlar el bucle
            char[] palabraArray = new char[tam];
            char[] secreta = new char[tam];
            char[] repetido = new char[50]; // creo un array para guardar los valores repetidos

            //descomponer la palabra y convertir caracteres en trazos
            for (int i = 0; i < tam; i++) {
                palabraArray[i] = palabra.charAt(i);
                secreta[i] = '-';
            };

            ////////////////////////////////////////////////////////////////////////
            System.out.println(titulo);
            opcion = sc.nextByte();
            salir = false;

            switch (opcion) {

                case 1:
                    //algoritmo para verificar si un caracter es correcto o no
 
                    while (vida > 0) {

                        //pedir un caracter al usuario
                        System.out.println("Introduzca una letra por vez:");
                        charUser = sc.next().charAt(0);
                        charUser = Character.toLowerCase(charUser); //convertir la letra en minuscula

                        //vuelvo a iniciar aciertos a 0 para que vuelva desde el inicio
                        cont = 0;

                        //uso el for para recoger cada caracter de la palabra
                        for (int i = 0; i < tam; i++) {
                            repetido[i] = charUser; // almaceno los caracteres para verificar si es repetido

                            if (palabraArray[i] == charUser && secreta[i] != repetido[i]) {
                                secreta[i] = charUser;
                                contCorrecto++;
                            } else if (palabraArray[i] != charUser) {
                                cont++;
                            }

                        }
                        //Imprimo por pantalla la palabra secreta con los caracteres que coincide
                        System.out.println(secreta);
                        //si acierto es igual al tamaño de la palabra, es decir que ningun caracter ha coincidido
                        //asi que el usuario pierde una vida
                        if (cont == tam) {
                            vida--;
                            System.out.println("vidas: " + vida);
                        }
                        if (vida == 0) {
                            System.out.println("Has perdido.");
                            System.out.println("La palabra secreta era: " + palabra);
                            Thread.sleep(3 * 1000);  // utilizo esta exception para "pausar" el mensaje por unos segundos
                            contCorrecto = 0;
                            salir = false;

                        } else if (contCorrecto == tam) {
                            System.out.println("\nHas ganado!!!\nLa palabra secreta es: " + palabra);
                            Thread.sleep(3 * 1000); // utilizo esta exception para "pausar" el mensaje por unos segundos
                            contCorrecto = 0;
                            vida = 0;
                            salir = false;
                        }
                    }
                    ;
                    break;

                case 2:
                    opNivel = 0; //vuelvo a poner opNivel a 0 
                    //para poder elegir opciones a la segunda vuelta
                    while (opNivel < 1 || opNivel > 3) {

                        System.out.println("\nElija el nivel al que quieres jugar cada nivel se incrementará más 2 vidas:\n");
                        System.out.println("1-Facil.\n2-Normal.\n3-Dificil.");
                        opNivel = sc.nextByte();

                        if (opNivel < 1 || opNivel > 3) {
                            System.out.println("Has introducido un valor fuera del rango");
                        }

                    }

                    break;
                case 3:
                    System.out.println("Juego finalizado");
                    salir = true;
                    break;
            }

        } while (salir != true);

    }
}

