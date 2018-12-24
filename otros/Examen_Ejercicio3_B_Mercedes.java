/*OPCIÓN B. Hacer un programa para visualizar los números curiosos que hay entre el número 2 y un número
introducido desde teclado. Un número es curioso si su cuadrado tiene al propio número como últimas cifras.
Así, el número 25 es curioso ya que su cuadrado es 625, también es curioso 76 porque su cuadrado es 5776
→ Para la implementación de este ejercicio, debe apoyarse en el uso de funciones. Estas funciones
deberán estar integradas en un paquete, y deben ser, al menos, las siguientes: (a) función que devuelva
el último dígito de un número -las unidades-, (b) función que, dado un número, devuelva otro número
idéntico, pero sin la cifra de las unidades, y (c) función para saber si un número es curioso. Debe decidir
los argumentos y los valores que, en su caso, cada función necesite.
Recomendación: utilice enteros largos para poder manejar valores enteros elevados.*/
import matematicas.Numero_curioso;
public class Examen_Ejercicio3_B_Mercedes {
  public static void main(String[] args) {
    
    
     /* Mercedes Perea 
     * 
     * 16 de diciembre del 2018
     * 
     * Programa para sacar numeros curiosos
     * 
     * 
     */
    
    long numeroOri=0;
    long cuadrado=0;
    
    System.out.print("Deme un numero y le dire cuantos numeros curiosos hay ente el 2 y su numero: \n");
    numeroOri= Integer.parseInt(System.console().readLine());
    
      /* cuadrado=numero * numero; //dara el cuadrado del numero
         System.out.print("El cuadrado de "+numero+ " es: "+cuadrado+ "\n");
      */
      /*  UltimaCifra=numero %10; //dara la ultima cifra del numero
          System.out.print("La ultima cifra del numero introducido es "+UltimaCifra+ "\n");
      */
    
      /*  NumNoUni=numero /10; //Numero sin la cifra de la unidad
          System.out.print("EL numero sin la cifra de la unidad es "+NumNoUni+ "\n");
      */
      
     
      for (int i=2; i<=numeroOri;i++){
        cuadrado=i * i; //dara el cuadrado del numero
      
        //comprobamos si es curioso o no
        if (i==matematicas.Numero_curioso.curioso(i)){
          System.out.print("El numero "+ i + " es curioso ya que su cuadrado da : "+cuadrado+ "\n");
          }
          
      }
          
          
  }
}
    
    
    
    
    
 
