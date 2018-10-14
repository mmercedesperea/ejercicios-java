public class ejercicio13{
  public static void main (String [] args){
    
   int orden1;
   int orden2;
   int orden3;
   
    System.out.println("¡Vamos a ordenar tus numeros!");
    
    System.out.println("Introduce el primer numero:");
     int numero1= Integer.parseInt(System.console().readLine());
     
     System.out.println("Introduce el segundo numero:");
     int numero2= Integer.parseInt(System.console().readLine());
     
     System.out.println("Introduce el tercer numero:");
     int numero3= Integer.parseInt(System.console().readLine());
     
      orden1= numero1;
      orden2= numero2;
      orden3= numero3;
      
      
      if ((numero1> numero2) &&( numero1> numero3)){
          if (numero2 < numero3) {
            orden2 = numero3;
            orden3 = numero2;
          }
      } else if ((numero2 > numero1) && (numero2 > numero3)) {
        orden1 = numero2;
        if (numero1 > numero3) {
          orden2 = numero1;
         
        } else {
          orden2 = numero3;
          orden3 = numero1;
        }
      } else if ((numero3 > numero1) && (numero3 > numero2)) {
        orden1 = numero3;
        if (numero1 > numero2) {
          orden2 = numero1;
          orden3 = numero2;
        } else {
          orden3 = numero1;
        }
      }
      
        
      System.out.printf("orden de estos numeros: %d  %d  %d \n",orden1, orden2, orden3);
      
       
    
 } 
}

 
  
  
  
      

      



