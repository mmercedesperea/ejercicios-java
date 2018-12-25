package funciones;
public class Varias {
  
  //comprueba si es primo
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }

  //saca digitos
  public static int digitos(int x) {
    if (x == 0) {
      return 1;
      } else {
        int n = 0;
        while (x > 0) {
        x = x / 10;
        n++;
        }
    return n;
    }
  }

  //comprueba si el numero es capicua o no
  public static boolean esCapicua(int x) {
    return x == voltea(x);
    }

     //da la vuelta a un numero
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
      }
    long volteado = 0;
    while(x > 0) {
        volteado = (volteado * 10) + (x % 10);
        x = x / 10;
      }
    return volteado;
  }

  //para sacar una potencia
  public static int potencia (int base, int exponente){
    if (exponente==0){
      return 1;
      }
     if (exponente<0){
       return 1 /potencia(base, -exponente);
       } 
      int n=1;
      for (int i=0; i<exponente; i++){
        n=n * base;
        } 
        return n;
      }
    
    
    //Para digito N: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
  public static int digitoN(long x, int n) {
     x = voltea(x);   // se tira de la funcion voltea
    int longitu=n-1;    // la posicion sera los numeros que tendremos que ir quitando
    while (longitu > 0) {   //mientras longitud sea mayor que 0
     longitu--;
      x = x / 10;
    } 
    return (int)x % 10;
    }
    
  //quitaPorDetras: Le quita a un número n dígitos por detrás (por laderecha)
  public static int quitaPorDetras(long x, int n) {
    while(n>0){
      n--;
      x=x/10;
      }
      return (int)x;
    }
    
    //quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
    public static int quitaPorDelante(long x, int n) {
      x=voltea(x); // le damos la vuelta al numero
      while(n>0){
        n--;
        x=x/10;
        }
      x=voltea(x); // le volvemos a lar la vuelta
        return (int)x;
    }
    
    //pegaPorDetras: Añade un dígito a un número por detrás.
    
      public static long juntaNumeros(long x, int y) {
        long resultado= (x* potencia(10,digitos(y)))+ y;  
        // se saca la poencia de 10 elevado al numero de digitos que tenga Y  se multiplica por x y se suma despues, ejemplo tenemos el 22 y queremos añadirle el 25,
        // pues seria 10 elevado a 2 ( ya que 25 tiene dos cifras), que saldria 100, esto multiplicado por nuestro 22 daria 2.200 +  25 saldria 2225.
        
     return resultado;
     }
      
      
      //pegaPorDelante: Añade un dígito a un número por delante.
    
      public static long juntaNumerosdelante(int x, long y) {
        long resultado= (y* potencia(10,digitos(x)))+ x;  
        // se saca la poencia de 10 elevado al numero de digitos que tenga Y  se multiplica por x y se suma despues, ejemplo tenemos el 22 y queremos añadirle el 25,
        // pues seria 10 elevado a 2 ( ya que 25 tiene dos cifras), que saldria 100, esto multiplicado por nuestro 22 daria 2.200 +  25 saldria 2225.
        
     return resultado;
     }
     
     
     //posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
     public static long  posicionDeDigito(int x, int d) {
       int i;
       for ( i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};
       if (i == digitos(x)) {
        return -1;
        } else {
               return i;
               }
      }
     
}


  
  
  




