/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.segundaetapa;

import java.util.Scanner;

/**
 *
 * @author lpwil
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i=1;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce un numero para saber sus divisibles: ");
        num=sc.nextInt();
        
        while(i <= num){
            
            if(num % i==0){
                System.out.println("Numeros divisibles: "+i);
            }
            i++;
        }
        
        
//        Scanner sc = new Scanner(System.in);
//        String palabra;
//        int char2 = 0, char1 = 0, tam, aciertos = 0;
//
//        System.out.println("Introduce una palabra para ponelar al reves: ");
//        palabra = sc.nextLine();
//
//        //Pasamos el tamaño de la palabra a la variable tam
//        tam = palabra.length();
//        char2 = palabra.length() - 1;
//
//        System.out.println("\nHas introducido: ");
//        //Usamos el for para recoger la palabra
//        //I es menor que tam? sumar un ( 0,1,2,3,4.....)
//        for (int i = 0; i < tam; i++) {
//
//            System.out.print(palabra.charAt(i));
//        }
//
//        //Ponemos un sout para crear un salto de linea entre una cadena y la cadena invertida
//        System.out.println("\nLa palabra al reves es: ");
//
//        //Invertimos la cadena... J tendra el valor de la ultima posicion de la cadena y asi no empiezará apartir de 0
//        // J es mayor o igual a 0? disminuir un j-- ( 7, 6, 5, 4....)
//        for (int j = palabra.length() - 1; j >= 0; j--) {
//
//            System.out.print(palabra.charAt(j));
//        }
//
//        System.out.println(" ");
//
//        while (char2 != char1) {
//
//            if (palabra.charAt(char1) == palabra.charAt(char2)) {
//                aciertos++;
//            }
//            char1++;
//            char2--;
//        }
//
//        if (aciertos == tam / 2) {
//            System.out.println("y la palabra es palindroma");
//        } else {
//            System.out.println("y la palabra 'No' es palindroma");
//        }
//    }
    }
}
