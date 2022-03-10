/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;


public class CCuenta {

    /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @Author jesus gonzalez
     * @Version primera versión
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
     * @Author jesus gonzalez
     * @Version primera versión
     */ 
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Param nombre del usuario
     * @Param cuenta del usuario
     * @Param saldo de la cuenta
     * @Param tipo de cuenta
     */ 
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Param nombre del usuario
     */ 
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Return el nombre
     */ 
        return getNombre();
    }


    public double estado()
    {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Return el saldo
     */ 
        return getSaldo();
    }


    public void ingresar(double cantidad) throws Exception
    {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Param cantidad de dinero a ingresar
     * @Throw excepción si hay cantidad negativa
     */ 
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Param cantidad a retirar
     * @Trows excepción por cantidad negativa
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
     * @Author jesus gonzalez
     * @Version primera versión
     * @Return cuenta
     */ 
        return getCuenta();
    }


    public String getNombre() {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Return nombre usuario
     */ 
        return nombre;
    }


    public void setNombre(String nombre) {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Param nombre del susuario
     */ 
        this.nombre = nombre;
    }


    public double getTipoInterés() {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Return tipo de interes
     */ 
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        /**
     * @Author jesus gonzalez
     * @Version primera versión
     * @Param tipo de interés
     */ 
        this.tipoInterés = tipoInterés;
    }
}
