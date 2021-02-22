
package gal.teis.javaoppextra.aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author lpwil
 */
public class Persona {
    
    //ATRIBUTOS DE UNA CLASS
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
 
    //GETTERS y SETTERS(encapsulamiento)
    //Para que las otras class o otros programas pueda acceder(obtener un metodo, para agregar o usar los atributos) a estos atributos tenemos que hacer la encapsulacion

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
  
    //Constructor
    public Persona(){
        JOptionPane.showConfirmDialog(null, "Hola soy el constructor");
    }
    
    //Aqui se hace una sobrecargar de metodos(aunque un constructor es igualmente un metodo)
    public Persona(String nombre){
        this.nombre = nombre;
        JOptionPane.showConfirmDialog(null, "Hola "+getNombre());
    }
    
    //Este metodo devuelve una string
    public String calcularIMC(){
        double pesoActual = peso / (Math.pow(altura, 2));
        
        if(pesoActual >= 20 && pesoActual <=25){
            return "Peso ideal";
        }else if(pesoActual < 20){
            return "Por abajo del peso";
        }else{
            return "Encima del peso ideal";
        }
    }
    
    public boolean mayorEdad(int edad){
        this.edad=edad;
        boolean mayor = false;
        
        if(edad>=18){
            mayor = true;
        }
        return mayor;
    }
    
    public String datos(){
    
        String informacion = "Informacion de la persona: \n"
                +"Nombre: "+nombre+"\n"
                +"Edad: "+edad+"\n"
                +"Peso: "+peso+"\n"
                +"Altura: "+altura+"\n";
        
        return informacion;
    }
}

