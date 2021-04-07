/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.vehiculo;

/**
 *
 * @author lpwil
 */
public class VehiculoAbonado extends Vehiculo {
 //constructor
    
    public VehiculoAbonado(int id) {
        super(id);
    }
     
    //getters
    public int getTiempo() {
        return tiempo;
    }

    //setters
    @Override
    public void setTiempo(int tiempo) {
        this.tiempo= tiempo;
    }
    
   
    //metodos
    @Override
    public double factura(){ 
        return this.tiempo*200.0;
    } 
    
 
    public double factura(String codigo){ 
        return this.tiempo*200.0 - 0.03;
    } 
}
