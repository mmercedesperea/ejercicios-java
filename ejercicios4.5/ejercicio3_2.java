public class ejercicio3_2{
  public static void main (String [] args){
    
    System.out.println("Introduzca el numero de la semana:");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero == 1){
     System.out.println ("Lunes");
    } 
    
    if (numero == 2){ 
      System.out.println("Martes");
    } 
      
    if (numero == 3){
      System.out.println("Miercoles");
    } 
      
    if (numero == 4) { 
      System.out.println("Jueves");
    } 
      
    if (numero ==5) {
      System.out.println ("Viernes");
    } 
        
    if (numero ==6) { 
      System.out.println("Sabado");
    }

    if (numero ==7) {
      System.out.println("Domingo");
    }

    if (numero >7) {
      System.out.println("Este numero de semana no es valido, introduce un numero del 1 al 7");
    }
}
}


