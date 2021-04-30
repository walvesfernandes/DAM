/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.vehiculo;

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
        
        //variables para facilitar la lectura
        int tempo;
        int tipo;
        
        Scanner sc = new Scanner(System.in);
        //Cliente
        Vehiculo c = new VehiculoCliente(12);
        //Abonado
        Vehiculo a = new VehiculoAbonado(32);
        
        //casting
        VehiculoCliente c1= (VehiculoCliente) c;
        VehiculoAbonado a1= (VehiculoAbonado) a;
        
        System.out.println("Introduzca el tiempo:");
        tempo = sc.nextInt();
        

        do {

            System.out.println("Introduzca el tipo de vehiculo\n 1-Cliente 2-Abonado");
            tipo = sc.nextInt();

            if (tipo == 1) {
                c1.setTiempo(tempo);
                System.out.println("\nTipo: Cliente \nLa factura es: " + c1.factura());

            } else if (tipo == 2) {
                a1.setTiempo(tempo);
                System.out.println("\nTipo: Abonado \nLa factura es: " + a1.factura());
                System.out.println("Con descuento: "+a1.factura("descuento"));
            }
        } while (tipo > 2 || tipo < 1);
    }

}
