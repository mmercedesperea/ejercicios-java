import funciones.Varias;
public class ejercicio_1_14_funciones {
  public static void main(String[] args) {
    int n;
    // esPrimo()
    System.out.print("Introduzca un número entero positivo para saber si es primo o no : ");
    n = Integer.parseInt(System.console().readLine());
    if (funciones.Varias.esPrimo(n)) {
    System.out.println("El " + n + " es primo.");
    } else {
    System.out.println("El " + n + " no es primo.");
    }
    System.out.println();
    
    //  digitos()

    System.out.print("Introduzca un número entero positivo para saber cuantos digitos tiene: ");
    n = Integer.parseInt(System.console().readLine());
    System.out.println(n + " tiene " + funciones.Varias.digitos(n) + " dígitos.");
    System.out.println();

    //Vemos si el numero es capicua.

    System.out.print("Introduzca un número entero positivo para ver si es capicua: ");
    n= Integer.parseInt(System.console().readLine());
    if (funciones.Varias.esCapicua(n)){
      System.out.println( n + " Es capicua");
    }else{
      System.out.println("El numero "+ n + " no es capicua");
    }
    System.out.println();

    //le damos la vuelta al numero

    System.out.print("Introduzca un número entero positivo para darle la vuelta: ");
    n= Integer.parseInt(System.console().readLine());
    System.out.println("El numero "+ n + " dado la vuelta es "+ funciones.Varias.voltea(n) );
    System.out.println();

    //potencia
    System.out.print("Vamos a sacar la potencia de un numero\n");
    System.out.print("Introduzca la base  ");
    int base= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente ");
    int exponente= Integer.parseInt(System.console().readLine());
    System.out.println("El numero "+ base + " elevado a "+ exponente + " da como resultado: "+ funciones.Varias.potencia(base,exponente) );
    System.out.println();

    //posicion n
    System.out.print("Vamos a sacar un numero de otro segun su posicion\n");
    System.out.print("Introduzca un numero  ");
    int numeroOri= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posicion del numero que quiere devolver ");
    int num= Integer.parseInt(System.console().readLine());
    System.out.println(funciones.Varias.digitoN(numeroOri,num) );
    System.out.println();

    //saca numeros por detras
    System.out.print("Introduzca un numero al cual le vamos a quitar cifras por detras ");
    numeroOri= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la cantidad de numeros que le quiere quitar por detras ");
    num= Integer.parseInt(System.console().readLine());
    System.out.println( funciones.Varias.quitaPorDetras(numeroOri,num) );
    System.out.println();
    
    //saca numeros por delante
    System.out.print("Introduzca un numero al cual le vamos a quitar cifras por delante ");
    numeroOri= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la cantidad de numeros que le quiere quitar por delante ");
    num= Integer.parseInt(System.console().readLine());
    System.out.println( funciones.Varias.quitaPorDelante(numeroOri,num) );
    System.out.println();
    
    //pega numeros por detras
    System.out.print("Introduzca un numero al cual le vamos a pegar cifras por detras ");
    long numero1= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el numero que le quiere añadir por detras ");
    int numero2= Integer.parseInt(System.console().readLine());
    System.out.println( funciones.Varias.juntaNumeros(numero1,numero2) );
    System.out.println();
    
     //pega numeros por delante
    System.out.print("Introduzca un numero al cual le vamos a pegar cifras por delante  ");
    int numero3= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el numero que le quiere añadir por delante ");
    long numero4= Integer.parseInt(System.console().readLine());
    System.out.println( funciones.Varias.juntaNumerosdelante(numero3,numero4) );
    System.out.println();
    
    //Encontrar en que posicion se encuentra un numero
    System.out.print("Introduzca un numero para posteriormente encontrar la posicion de un digito en el  ");
    int numero5= Integer.parseInt(System.console().readLine());
    System.out.print("Ahora vamos a ver en que posicion se encuentra el digito que introduzca ");
    int numero6= Integer.parseInt(System.console().readLine());
    System.out.println( funciones.Varias.posicionDeDigito(numero5,numero6) );
    System.out.println();


 }
}
