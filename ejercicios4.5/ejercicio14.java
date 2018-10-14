public class ejercicio14{
 public static void main (String [] args){
   
   int x;
   
   System.out.printf("Introduce un numero para saber si es par o impar o divisible entre 5  \n");
    x = Integer.parseInt(System.console().readLine());
    
    
    if ((x %2) ==0){
    System.out.printf("El numero introducido es par \n");
    }
    else {
    System.out.println("El numero es impar \n");
    }

    if ((x % 5) ==0){
    System.out.printf("El numero es divisible entre 5 \n");
    }
    else{
    System.out.printf("El numero no es divisible entre 5 \n");
    }
     }
}
    
