package cuentas;

/**
 * Clase principal de Java.
 * @author Manuel Malvar Tombo
 */
public class Main {

  /**
   * COnstructor no necesario para Main // Evita error Javadoc
   */
  public Main(){}
  
  /**
   * Punto de inicio de la aplicación.
   * @param args Propio de Java
   */
  public static void main(String[] args) {

    CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

    System.out.println("El saldo actual es "+ cuenta1.estado() );

    operativa_cuenta(cuenta1, 2300, "retirar");
    operativa_cuenta(cuenta1, 695, "ingresar");

  }

  /**
   * Abstrae la funcionalidad en el propio método al recibir el objeto cuenta, más fácil de testear y mantener.
   * @see cuentas.CCuenta
   * @param cuenta Objeto cuenta 
   * @param cantidad Importe de la operación 
   * @param action Acción a realizar ("ingresar | retirar")
   * @see cuentas.CCuenta#ingresar(double) 
   * @see cuentas.CCuenta#retirar(double)
   */
  private static void operativa_cuenta(CCuenta cuenta, float cantidad, String action) {
    CCuenta cuentaBanco = cuenta;
    String tipoOperacion = action;
    double dCantidad = (double) cantidad;

    switch (tipoOperacion) {
      case "retirar" -> {
        try {
          cuentaBanco.retirar(dCantidad); // Usar el parámetro cantidad
          System.out.println("Retirada en cuenta: " + cantidad);
          System.out.println("Saldo: " + cuenta.estado());
        } catch (Exception e) {
          System.out.print("Fallo al retirar");
        }
      }

      case "ingresar" -> {
        try {
          cuentaBanco.ingresar(cantidad); // Usar el parámetro cantidad
          System.out.println("Ingreso en cuenta: " + cantidad);
          System.out.println("Saldo: " + cuenta.estado());
        } catch (Exception e) {
          System.out.print("Fallo al ingresar");
        }
      }

      default -> System.out.print("Operación no válida");
    }
  }
}