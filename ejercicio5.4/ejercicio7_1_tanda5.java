//Realiza el control de acceso a una caja fuerte. La combinación será un
//número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
//acertamos, se nos mostrará el mensaje Lo siento, esa no es la combinación
//y si acertamos se nos dirá La caja fuerte se ha abierto satisfactoriamente
//Tendremos cuatro oportunidades para abrir la caja fuerte.

public class ejercicio7_1_tanda5 {
  public static void main (String[] args) {
    int numeroSecreto = 4567;
    int maxIntentos = 5;
    int intento;
    
    boolean adivinado = false;
    
    for (int contador = 0; (adivinado == false) && (contador < maxIntentos) ; contador ++) {
      System.out.print("Introduzca el nº secreto ("+ (maxIntentos-contador) +"): ");
      intento = Integer.parseInt(System.console().readLine());
      
      if (intento == numeroSecreto) {
          adivinado = true;
      }
    }
    
    if (adivinado) {
      System.out.println("Número secreto adivinado.");
    } else {
      System.out.println("Agotaste los intentos y no lo adivinaste.");
    }
    
  }
}
