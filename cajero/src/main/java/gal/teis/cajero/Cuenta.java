/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.cajero;

/**
 *
 * @author lpwil
 */
public class Cuenta {
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //SETTERS
    public void setNombre(String s) {
        nombre = s;
    }
     public void setTipoInteres(double n) {
        tipoInteres = n;
    }

    public void setNumeroCuenta(String s, Byte nivel) {
    //Solo deja realizar el cambio a quién tenga
    //un determinado nivel de acceso
        if (nivel == 1) {
            numeroCuenta = s;
        }
    }

   
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    //METODOS
    
    //método ingreso
    public boolean hacerIngreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    //método reintegro
    public boolean hacerReintegro(double n) {
        boolean reintegroCorrecto = true;
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }


}
