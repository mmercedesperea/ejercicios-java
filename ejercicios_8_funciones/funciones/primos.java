package funciones;
public class primos {

//comprueba si es primo
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
       }
      }
    return true;
  }

}
