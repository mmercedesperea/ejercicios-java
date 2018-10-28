/*Ejercicio 51
El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y
el 8 (todos los que encuentre). Realiza un programa que muestre un número
antes y después de haber sido comido por el gusano. Si el animalito no se ha
comido ningún dígito, el programa debe indicarlo.*/

public class ejercicio51_tanda5 {
  public static void main(String[] args) {
    
    
    
    long numeroOriginal=0;
    long volteado=0;
    long numero=0;
    
    System.out.print("Introduce un numero entero (mayor que cero):\n");
    numeroOriginal= Long.parseLong(System.console().readLine());
    
    numero=numeroOriginal;
    
    while (numero > 0) {
      if ((numero % 10 != 0) && (numero % 10 != 8)) {
      volteado = (volteado * 10) + (numero % 10);
      }
      numero /= 10;
    }
    
    numero = volteado;
    volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    if (numeroOriginal == volteado) {
      System.out.print("El gusano no se ha comido ninguna rosquilla en " + volteado + ".");
    } else {
      System.out.print("El gusano ha comido rosquillas en " + numeroOriginal + " y ahora es " + volteado + ".");
    }
  }
}
