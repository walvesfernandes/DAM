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
public abstract class Vehiculo {
    
    //cambie a int para evitar problemas
    protected int id;
    protected int tiempo;

    public Vehiculo(){}
    
    public Vehiculo (int id){
    this.id=id;
    tiempo=0;
    }
    
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    abstract public double factura();
}
  
