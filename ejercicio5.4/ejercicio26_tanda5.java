/*Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.*/

public class ejercicio26_tanda5{
  public static void main (String[] args){
    
    int numero=0;
    int digi=0;
    int posi=1;
    int numeroOriginal=0;
    int vuelta=0;
    
    System.out.print("Introduce un numero y a continuacion un digito y te dire que posicion o posiciones ocupa ese digito en el nuemro introducido: \n");
    System.out.print("Introduce primero el numero\n");
    numeroOriginal= Integer.parseInt(System.console().readLine());
    System.out.print("Ahora dame el digito:\n");
    digi= Integer.parseInt(System.console().readLine());
    System.out.printf("El numero %d aparece en las siguientes posicion del numero %d: \n",digi,numeroOriginal);
    
       numero=numeroOriginal;

      while (numero>0){                    //mientras numero sea mayor que 0
        vuelta=(vuelta*10)+ (numero%10);   // primero el numero eje 234 en la primera vuelta vuelta sera 0*10 =0 + el resto de 234 /10 es = 4. 
        numero= numero/10;                // el numero 234 se divide entre 10 = 23. por lo tanto vuelve a dar la vuelta    
      }
    
      while (vuelta>0){                     //Vuelta ahora es el numero inverso al que se ha metido ej.432
        if((vuelta%10)==digi){              //si el resto de vuelta entre 10 es igual al digito que se quiere saber (en este caso el resto de vuelta seria 2 en la primera ronda)
          System.out.printf(posi + " ");// mostrara contador
        }
        vuelta=vuelta/10;                   //el numero se ira descomponiendo hasta que llegue a 0 por lo tanto en la primera ronda que vale 432 ahora se dividira entre 10 dando como resultado 43.
        posi++;                         //sumara un 1 al contador.
      }      
  }
}
