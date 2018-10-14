public class ejercicio1{
  public static void main (String [] args){
    
    System.out.println("¿Que asignatura toca hoy?");
    System.out.println("Introduzca el numero de la semana:");
    
      int numero = Integer.parseInt(System.console().readLine());
    
      if (numero == 1){
        System.out.println ("Hoy toca Sistemas Informaticos");
        } 
    
      if (numero == 2){ 
        System.out.println("Hoy toca Programacion");
        } 
      
      if (numero == 3){
        System.out.println("Hoy toca Entorno de desarrollo");
        } 
      
      if (numero == 4) {
        System.out.println("Hoy toca Entorno de desarrollo");
        } 
      
      if (numero ==5) {
        System.out.println ("Hoy toca Sistemas Informaticos");
        } 
        
      if (numero >=6) {
        System.out.println("este no es un numero de semana valido");
        }
 }
}


