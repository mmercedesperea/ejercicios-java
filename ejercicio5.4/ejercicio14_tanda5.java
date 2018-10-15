//Escribe un programa que pida una base y un exponente (entero positivo) y
//que calcule la potencia.

public class ejercicio14_tanda5 {
  public static void main(String[] args) {
    
   int numero;
   int exponente;
   int solucion= 1;
   
   System.out.print("Introduzca la base(entera) ");
   numero= Integer.parseInt(System.console().readLine());
   System.out.print("Introduzca el exponente(entero) ");
   exponente= Integer.parseInt(System.console().readLine());
   
   if (exponente==0){
     solucion = 1;
     }
   
    for (int i=1; i <=exponente; i ++ ) {  
        solucion = solucion * numero;
      }
        System.out.print("El resultado de "+ numero + " elevado a "+ exponente+ " es igual a " + solucion + ".\n");
         
    }
      
  
  }

