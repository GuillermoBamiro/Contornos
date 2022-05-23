package Cuentas;
/**
* Operativo de Cuentas
* Esta clase se encarga del operativo de cuentas
* @author Guillermo Dominguez Suarez
* @version 0.1, 21/05/2022
*/
public class CCuenta {
    /**
     * @param nombre Nombre titular cuenta
     */
    private String nombre;
    /**
     *@param cuenta numero de la cuenta bancaria 
     */
    private String cuenta;
    /**
     * @param saldo saldo de la cuenta
     */
    private double saldo;
    /**
     * @param tipo de interes Tipo de interes de la cuenta
     */
    private double tipoInterés;
    
    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     * metodo set nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta 
     * metodo set de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo 
     * metodo set de saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés
     * metodo set de tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


/**
 *  Metodo iniciador de los parametro de clase CCuenta
 * @param nom inicia nombre
 * @param cue inicia cuenta
 * @param sal inicia saldo
 * @param tipo inicia tipoInteres
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * 
 * @return el saldo de la cuenta
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Metodo que lleva la operativa de ingresos en cuenta
 * @param cantidad
 * @throws Exception si el ingreso es inferior a cero
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * metodo que lleva la operativa de retirada de cuenta y resta lo retirado al 
 * saldo
 * @param cantidad
 * @throws Exception Si la cantidad a retirar es negativa
 * si el saldo es menor a la cantidad
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
