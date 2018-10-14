public class ejercicio18{
  public static void main (String [] args){
    
    /*Escribe un programa que diga cuál es la primera cifra de un número entero
      introducido por teclado. Se permiten números de hasta 5 cifras.*/
    
    int numero=0;
     
    System.out.print("Vamos a decirte cual es la primera cifra del numero entero que introduzca:\n");
    int cifra= Integer.parseInt(System.console().readLine());

    if (cifra< 10){
      numero= cifra;
    } else if ((cifra >= 10)&& (cifra<100)){
      numero= cifra/10;
    } else if ((cifra>=100) && (cifra<1000)){
      numero=cifra/100;
    } else if ((cifra>=1000) && (cifra<10000)){
      numero=cifra/1000;
    } else if ((cifra>=10000) && (cifra<100000)){
      numero=cifra/10000;
    }
    
    if (cifra>100000){
      System.out.print("El numero tiene mas de las cifras permitidas");
    } else {System.out.printf( "La primera cifra del numero que has introducido es: %d",numero);
       
  }
}
