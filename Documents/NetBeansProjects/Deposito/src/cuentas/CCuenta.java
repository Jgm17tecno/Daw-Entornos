/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;


public class CCuenta {

    /**
     * @author jesus gonzalez
     * @version primera versión
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @author jesus gonzalez
     * @version primera versión
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @author jesus gonzalez
     * @version primera versión
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @author jesus gonzalez
     * @version primera versión
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;


    public CCuenta()
    {
     /**
     * @author jesus gonzalez
     * @version primera versión
     */ 
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @param nombre del usuario
     * @param cuenta del usuario
     * @param saldo de la cuenta
     * @param tipo de cuenta
     */ 
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @param nombre del usuario
     */ 
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @return el nombre
     */ 
        return getNombre();
    }


    public double estado()
    {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @return el saldo
     */ 
        return getSaldo();
    }


    public void ingresar(double cantidad) throws Exception
    {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @param cantidad de dinero a ingresar
     * @throw excepción si hay cantidad negativa
     */ 
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @param cantidad a retirar
     * @trows excepción por cantidad negativa
     */ 
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    public String obtenerCuenta()
    {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @return cuenta
     */ 
        return getCuenta();
    }


    public String getNombre() {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @return nombre usuario
     */ 
        return nombre;
    }


    public void setNombre(String nombre) {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @param nombre del susuario
     */ 
        this.nombre = nombre;
    }


    public double getTipoInterés() {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @return tipo de interes
     */ 
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        /**
     * @author jesus gonzalez
     * @version primera versión
     * @param tipo de interés
     */ 
        this.tipoInterés = tipoInterés;
    }
}
