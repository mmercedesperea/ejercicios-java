/*Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés*/

public class ejercicio25_tanda5{
  public static void main (String[] args){
      
    int vuelta=0;
    
    System.out.print("Dame un numero y le dare la vuelta\n");
      int numeroOriginal= Integer.parseInt(System.console().readLine());
      
      int numero=numeroOriginal;

      while (numero>0){                            //mientras numero sea mayor que 0
        vuelta=(vuelta*10)+ (numero%10);           // primero el numero eje 234 en la primera vuelta vuelta sera 0*10 =0 + el resto de 234 /10 es = 4.
        numero= numero/10;                         // el numero 234 se divide entre 10 = 23. por lo tanto vuelve a dar la vuelta 
       
      }
    System.out.printf("El numero original %d si le damos la vuelta es %d ",numeroOriginal,vuelta);
  }
}

                                                     // en la segunda vuelta como 23 es mayor que cero 
                                                      //  vuelta (que ahora vale 4) + numero (que ahora vale 23 cuyo resto entre 10 es 3)  = 43
                                                      // y ahora numero sera 23/10= 2
                                                      
                                                      // en la tercera vuelta como 2 es mayor que 0 se vuelve a dar una vuelta.
                                                      //vuelta que ahora vale 43 * 10= 430 + numero ( que ahora vale 2) = 432.
