/*Escribe un programa que diga si un número introducido por teclado es o no
  primo. Un número primo es aquel que sólo es divisible entre él mismo y la
  unidad.*/

public class ejercicio16_tanda5 {
  public static void main(String[] args) {
    
   int numero;
   boolean primo =true;
   
   System.out.print("Vamos a saber si el numero que introduzca es primo o no, introduce el numero:  ");
   numero= Integer.parseInt(System.console().readLine());
   
    for (int i=2; i <numero; i ++) {  
       if ((numero % i)==0){  //Esto hace que se compruebe que el numero dividido entre i  el resto es 0 primo sera false.
        primo= false;
       }
    } 
   
    if (primo==true){
        System.out.println("El numero introducido es primo.");
      }else{
          System.out.println("El numero introducido no es primo.");
        }
  }
 
}

