/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.cajero;

import java.util.Scanner;
import gal.teis.Menu;
import java.util.ArrayList;
import java.util.InputMismatchException;
        
/**
 *
 * @author lpwil
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un array list para las opciones del menu
       ArrayList<String> menuop = new ArrayList<>();
        menuop.add("Hacer ingreso");
        menuop.add("Resta");
        menuop.add("Ver saldo");
        menuop.add("Salir");
        
       float dinero; 
       byte opi;
      
       
       boolean continua=true;
        
       //Creamos un menu con las opciones correspondientes(menuop)
       Menu minu= new Menu(menuop);
       
       //Creo una nueva cuenta
       Cuenta cliente= new Cuenta();
       
 
   do{
       
        try {
           
            continua=true;
            minu.printMenu();
            Scanner sc= new Scanner(System.in);
            
            //Pido los datos por teclado y guardo en la variable opi
            minu.rango(opi=sc.nextByte());
            
       switch(opi){
           
           //Hacer ingreso
           case 1 -> { 
               System.out.println("Que cantidad quieres ingresar?");
               dinero=sc.nextFloat();
               cliente.hacerIngreso(dinero);
               System.out.println("\nHas ingresado: "+(int)dinero+"$$$\n\n");
               continua=false;
            }
           //Hacer retirada 
           case 2 -> {
               System.out.println("Que cantidad quieres retirar?");
               dinero=sc.nextFloat();
               cliente.hacerReintegro(dinero);
               System.out.println("\nHas retirado: "+(int)dinero+"$$$\n\n");
               continua=false;
            }
           //Ver saldo 
           case 3 -> {
               System.out.println("\n-Saldo actual: "+cliente.getSaldo()+"$$$\n\n");
               continua=false;
           }
               default -> System.out.println("-Sesion finalizada-");
       }

          } catch (InputMismatchException e) {
              System.out.println("Has introducido una opcion invalida, vuelve a intentar");
              continua=false;
          }    
       }while(!continua);
    }
}
