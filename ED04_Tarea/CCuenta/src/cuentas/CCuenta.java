package cuentas;

/**
 * Modelo: Clase para gestionar los objetos cuenta con los métodos, getter y setter  
 * @author Manuel Malvar Tombo
 */
public class CCuenta {
  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoInteres;
  /**
   * Obtener nombre
   * @return nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Modificar nombre
   * @param nombre nuevo nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Obtener cuenta
   * @return cuenta
   */
  public String getCuenta() {
    return cuenta;
  }

  /**
   * Modificar cuenta
   * @param cuenta Nueva cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Obtener saldo
   * @return saldo
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * Modificar saldo
   * @param saldo Nuevo saldo
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Obtener tipoInteres
   * @return the tipoInteres
   */
  public double getTipoInteres() {
    return tipoInteres;
  }

  /**
   * Modificar tipoInteres
   * @param tipoInteres Nuevo tipoInteres
   */
  public void setTipoInteres(double tipoInteres) {
    this.tipoInteres = tipoInteres;
  }

  /**
   * Constructor vacío si no recibe parámetros
   */
  public CCuenta(){}

  /**
   *Inicializamos la clase CCuenta con los parametros indicados.
   * @param nom nombre del propietario de la cuenta
   * @param cue Cuenta 
   * @param sal Saldo de la cuenta
   * @param tipo Tipo de interés
   */
  public CCuenta(String nom, String cue, double sal, double tipo){
    this.nombre = nom;
    this.cuenta = cue;
    this.saldo = sal;
    this.tipoInteres = tipo;
  }

  /**
   * Obtener estado
   * @return saldo
   */
  public double estado(){
    return getSaldo();
  }

  /**
   * Indica la cantidad a ingresar.
   * @param cantidad Cantidad a añadir al saldo actual.
   * @throws Exception Error mostrado al no poder realizar la operación
   */
  public void ingresar(double cantidad) throws Exception {
    if (cantidad<0)
      throw new Exception("No se puede ingresar una cantidad negativa");
    setSaldo(getSaldo() + cantidad);
  }

  /**
   * Indica la cantidad a retirar
   * @param cantidad Cantidad a retirar. Restar del saldo actual
   * @throws Exception Error mostrado al no poder realizar la operación
   */
  public void retirar(double cantidad) throws Exception {
    if (cantidad <= 0)
      throw new Exception ("No se puede retirar una cantidad negativa");
    if (estado()< cantidad)
      throw new Exception ("No se hay suficiente saldo");
    setSaldo(getSaldo() - cantidad);
  }
}
