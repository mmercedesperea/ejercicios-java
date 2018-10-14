public class ejercicio19{
  public static void main (String [] args){
    
    /*Realiza un programa que nos diga cuántos dígitos tiene un número entero que
      puede ser positivo o negativo. Se permiten números de hasta 5 dígitos..*/

    System.out.print("Vamos a decirle cuantos digitos tiene un numero entero que introduzca(Se permiten numeros de hasta 5 digitos):\n");
    int cifra= Integer.parseInt(System.console().readLine());

    if (cifra< 10){
        System.out.print("Su numero tiene un digito.");
    } else if ((cifra >= 10)&& (cifra<100)){
        System.out.print("Su numero tiene dos digitos.");
    } else if ((cifra>=100) && (cifra<1000)){
        System.out.print("Su numero tiene tres digitos.");
    } else if ((cifra>=1000) && (cifra<10000)){
        System.out.print("Su numero tiene cuatro digitos.");
    } else if ((cifra>=10000) && (cifra<100000)){
        System.out.print("Su numero tiene cinco digitos.");
     } else if (cifra>100000){
        System.out.print("El numero tiene mas de las cifras permitidas.");
     }
  }
}
