package gal.teis.stockventanas;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lpwil
 * 
 */
public class Principal {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBS: la opcion de venta me gustaria que fuese de otra manera, pero no fui capaz de desarrollar
        
        
        //Objetos
        TipoA modeloA = null;
        TipoB modeloB = null;

        //Variable para controlar la key del hashmap
        int cont = 0;

        //Variables aux para menus
        byte op;
        byte fab = 0;
        byte mod = 0;
        byte color;
        byte opComp;

        HashMap<Integer, Object> ventanas = new HashMap<Integer, Object>();

        do {

            System.out.println("Bienvenido a su tienda de ventanas!!! \n\n");
            System.out.println("***Menu Principal*** \n");
            System.out.println("1.-Si deseas crear una ventana\n0.-finalizar el programa ");
            op = sc.nextByte();

            switch (op) {
                //Menu para crear ventanas
                case 1:

                    System.out.println("Para fabricar una ventanas necesitamos que elijas un modelo y color:");
                    System.out.println("1.-Ver modelos\n");
                    System.out.println("2.-Fabricar");
                    fab = sc.nextByte();
                    switch (fab) {

                        //Mostra todos los modelos y colores que hay
                        case 1:

                            System.out.println("");
                            System.out.println("******** Modelo A ***********");
                            modeloA = new TipoA();
                            System.out.println(modeloA.infoVentana());
                            System.out.println("");
                            System.out.println("******** Modelo B **********");
                            modeloB = new TipoB();
                            System.out.println(modeloB.infoVentana());
                            break;

                        //Para crear ventana y posteriormente venderla
                        case 2:

                            System.out.println("Primero introduzca el modelo: \n 1.-Modelo A, 2.-Modelo B");
                            mod = sc.nextByte();

                            //En funcion del modelo A elegir el color de acuerdo con la ventana leccionada
                            if (mod == 1) {
                                System.out.println("Ahora elija el color:");
                                System.out.println("1.-rojo, 2.-verde, 3.-azul, 4.-gris, 5.-blanco");
                                color = sc.nextByte();
                                //Uso switch para controlar la seleccion de colores
                                switch (color) {
                                    //Creo la ventana y añado al map con sus valores
                                    case 1:
                                        cont++;
                                        modeloA = new TipoA();
                                        ventanas.put(cont, "\nColor: " + modeloA.setColor("rojo") + "\nAncho: " + modeloA.ancho + "\nLargo: " + modeloA.largo + "\nPrecio: " + modeloA.precio + "\nMaterial: " + modeloA.material);

                                         {
                                            //Creo una "simulacion de creacion de ventana" con efecto sleep
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("\n¡¡¡Ventana creada!!!\n");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;

                                    case 2:
                                        cont++;
                                        modeloA = new TipoA();
                                        ventanas.put(cont, "\nColor: " + modeloA.setColor("verde") + "\nAncho: " + modeloA.ancho + "\nLargo: " + modeloA.largo + "\nPrecio: " + modeloA.precio + "\nMaterial: " + modeloA.material);
                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!\n");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;
                                    case 3:
                                        cont++;
                                        modeloA = new TipoA();
                                        ventanas.put(cont, "\nColor: " + modeloA.setColor("azul") + "\nAncho: " + modeloA.ancho + "\nLargo: " + modeloA.largo + "\nPrecio: " + modeloA.precio + "\nMaterial: " + modeloA.material);
                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;
                                    case 4:
                                        cont++;
                                        modeloA = new TipoA();
                                        ventanas.put(cont, "\nColor: " + modeloA.setColor("gris") + "\nAncho: " + modeloA.ancho + "\nLargo: " + modeloA.largo + "\nPrecio: " + modeloA.precio + "\nMaterial: " + modeloA.material);
                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;
                                    case 5:
                                        cont++;
                                        modeloA = new TipoA();
                                        ventanas.put(cont, "\nColor: " + modeloA.setColor("blanco") + "\nAncho: " + modeloA.ancho + "\nLargo: " + modeloA.largo + "\nPrecio: " + modeloA.precio + "\nMaterial: " + modeloA.material);
                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;
                                }
                                //En funcion del modelo A elegir el color de acuerdo con la ventana leccionada
                            } else if (mod == 2) {
                                System.out.println("Ahora elija un color:");
                                System.out.println("1.-morado, 2.-amarillo, 3.-negro, 4.-metalizado, 5.-blanco");
                                color = sc.nextByte();
                                //Uso switch para controlar la seleccion de colores
                                switch (color) {
                                    case 1:
                                        cont++;
                                        modeloB = new TipoB();
                                        ventanas.put(cont, "\nColor: " + modeloB.setColor("morado") + "\nAncho: " + modeloB.ancho + "\nLargo: " + modeloB.largo + "\nPrecio: " + modeloB.precio + "\nMaterial: " + modeloB.material);

                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;

                                    case 2:
                                        cont++;
                                        modeloB = new TipoB();
                                        ventanas.put(cont, "\nColor: " + modeloB.setColor("amarillo") + "\nAncho: " + modeloB.ancho + "\nLargo: " + modeloB.largo + "\nPrecio: " + modeloB.precio + "\nMaterial: " + modeloB.material);
                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;
                                    case 3:
                                        cont++;
                                        modeloB = new TipoB();
                                        ventanas.put(cont, "\nColor: " + modeloB.setColor("negro") + "\nAncho: " + modeloB.ancho + "\nLargo: " + modeloB.largo + "\nPrecio: " + modeloB.precio + "\nMaterial: " + modeloB.material);
                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;
                                    case 4:
                                        cont++;
                                        modeloB = new TipoB();
                                        ventanas.put(cont, "\nColor: " + modeloB.setColor("metalizado") + "\nAncho: " + modeloB.ancho + "\nLargo: " + modeloB.largo + "\nPrecio: " + modeloB.precio + "\nMaterial: " + modeloB.material);
                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;
                                    case 5:
                                        cont++;
                                        modeloB = new TipoB();
                                        ventanas.put(cont, "\nColor: " + modeloB.setColor("blanco") + "\nAncho: " + modeloB.ancho + "\nLargo: " + modeloB.largo + "\nPrecio: " + modeloB.precio + "\nMaterial: " + modeloB.material);
                                         {
                                            //Creo una "simulacion de creacion de ventana"
                                            try {
                                                System.out.println("¡¡¡Manos a la obra!!!");
                                                System.out.println("............");
                                                Thread.sleep(1000);
                                                System.out.println("..........");
                                                Thread.sleep(1000);
                                                System.out.println("........");
                                                Thread.sleep(1000);
                                                System.out.println("Listo, tu ventana ya ha sido creada!!!");
                                            } catch (InterruptedException ex) {
                                                System.out.println("Opsss....Algo ha fallado, vuelva a intentar");
                                            }
                                        }
                                        break;
                                }
                            } else {
                                System.out.println("Opción no valida");
                            }
                            break;

                    }
                case 2:

                    if (!ventanas.isEmpty()) {
                        System.out.println("Modelo nº" + cont + " que tenemos a venta: " + ventanas.get(cont));
                        System.out.println("1.-Quieres comprar?\t 2.-Salir");
                        opComp = sc.nextByte();

                        //gestion de venta
                        if (opComp == 1) {

                            //for para mostrar los modelos ya fabricados
                            for (int i = 1; i <= cont; i++) {
                                System.out.println("\n Modelo nº" + i + ": " + ventanas.get(i));
                            }

                            //Hago el control por si quiere cancelar la compra
                            System.out.println("Introduzca el numero equivalente al modelo que quieres o 0 para cancelar:");
                            opComp = sc.nextByte();
                            if (opComp == 0) {

                            } else {
                                //Utilizo el metodo remove para simular la venta y eliminar la ventana del stock
                                ventanas.remove(opComp);
                                System.out.println("\n¡¡¡Venta exitosa!!!");
                            }
                        }
                    }
                    break;
            }
            //While para controlar que siga ejecutando el bucle hasta que el cliente seleccione la opcion de salida 
        } while (op != 0);

    }
}
