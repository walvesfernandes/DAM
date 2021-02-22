
package gal.teis.javaoppextra.aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author lpwil
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Estancia de una class
        //Pedro es el objeto
        //El constructor se ejecuta automaticamente al crear la estancia de la class
        Persona pedro = new Persona();
    
        String nombre= JOptionPane.showInputDialog("Introduce tu nombre: ");
        
        String edadS= JOptionPane.showInputDialog("Introduce tu edad: ");
        int edad = Integer.parseInt(edadS);
        
        //tenemos que parsear los datos inserido por teclado a int
        String pesoD= JOptionPane.showInputDialog("Introduce tu peso: ");
        double peso = Double.parseDouble(pesoD);
        
        //Otra forma de parsear con menos codigo
        double altura= Double.parseDouble(JOptionPane.showInputDialog("Introduce tu altura: "));
        
        pedro.setNombre(nombre);
        pedro.setEdad(edad);
        pedro.setPeso(peso);
        pedro.setAltura(altura);
        
        
        JOptionPane.showConfirmDialog(null, pedro.datos()+ "\n"
        +pedro.calcularIMC()+"\n"+pedro.mayorEdad(edad));
    }
    
}
