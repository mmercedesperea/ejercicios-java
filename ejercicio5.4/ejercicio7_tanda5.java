//Realiza el control de acceso a una caja fuerte. La combinación será un
//número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
//acertamos, se nos mostrará el mensaje Lo siento, esa no es la combinación
//y si acertamos se nos dirá La caja fuerte se ha abierto satisfactoriamente
//Tendremos cuatro oportunidades para abrir la caja fuerte.

public class ejercicio7_tanda5 {
  public static void main(String[] args) {
    
    int numeroCaja= 7548;
    int maxIntento=4;
    int intento;
    int contador=0;
    boolean adivinado=false;
    System.out.print("Vamos a abrir la siguiente caja fuerte, para ello introduce un numero de cuatro cifras, tienes cuatro oportunidades\n");
    
    do {
      intento = Integer.parseInt(System.console().readLine());
        if (intento == numeroCaja){
          adivinado=true;
          }else{
          System.out.print("Lo siento, esa no es la combinacion\n");
        }
      contador ++;

      } while ((adivinado == false) && (contador<maxIntento));
 
        if (adivinado==true){
          System.out.print("La caja fuerte se ha abierto satisfactoriamente ");
          }else{
           System.out.print("La caja se ha bloqueado ");
          }

}
}
