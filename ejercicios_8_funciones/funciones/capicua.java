package funciones;
public class capicua {


//comprueba si el numero es capicua o no
  public static boolean esCapicua(int x) {
    return x == voltea(x);   // si el numero introducido es igual a su vuelta 
  }

//da la vuelta a un numero
  public static long voltea(long x) {
    long volteado = 0;
    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    return volteado;
  }
  
  
}  
