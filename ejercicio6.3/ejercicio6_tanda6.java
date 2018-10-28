/*Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. 
El usuario debe adivinarlo y tiene para ello 5 oportunidades.
Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
es menor o mayor que el número secreto.*/

public class ejercicio6_tanda6 {
  public static void main(String[] args) {
    
    int numeroAzar;
    int numero=0;
    int intento=5;
    
    int mini=0;
    int maxi=101;
    
    numeroAzar=(int)(Math.random()*100);
    
    System.out.print("Intenta adivinar el numero secreto, para ello tiene 5 intentos : \n");
    
      do{
        numero=Integer.parseInt(System.console().readLine());
        
        intento--;

         if (numero<numeroAzar){
            mini=numero;
          }
         
         if (numero>numeroAzar){
            maxi=numero;
          }
         if (numero !=numeroAzar){  
            System.out.printf("El numero esta entre %d y %d \n",mini,maxi); 
            System.out.printf("Le quedan %d intentos \n",intento); 
          }
        
      } while ((numero !=numeroAzar) && (intento!=0));
        
      if (numero==numeroAzar){
          System.out.print("El numero es correcto");      
      }else {
          System.out.print("Ya no le quedan intentos"); 
          
       }
  }
 } 
