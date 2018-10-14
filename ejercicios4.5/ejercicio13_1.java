public class ejercicio13_1{
  public static void main (String [] args){
    
   int numero0;
   
    System.out.println("¡Vamos a ordenar tus numeros!");
    
    System.out.println("Introduce el primer numero:");
     int numero1= Integer.parseInt(System.console().readLine());
     
     System.out.println("Introduce el segundo numero:");
     int numero2= Integer.parseInt(System.console().readLine());
     
     System.out.println("Introduce el tercer numero:");
     int numero3= Integer.parseInt(System.console().readLine());
     
      
      if (numero1> numero2) {
        numero0 = numero1;
        numero1 = numero2;
        numero2 = numero0;
          }
       if (numero2 > numero3) {
        numero0 = numero2;
        numero2= numero3;
        numero3 = numero0;
         
        } 
        
        if (numero1> numero2) {
        numero0 = numero1;
        numero1 = numero2;
        numero2 = numero0;
          }

      System.out.printf("orden de estos numeros: %d  %d  %d \n",numero1, numero2, numero3);
      
       
    
 } 
}

 
  
  
  
      

      



