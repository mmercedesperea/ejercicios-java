/*Ejercicio 12
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.*/

public class ejercicio_12_tanda6 {
  public static void main(String[] args) {
    
    int linea=0;
    
      for(int i=1;i<20000;i++){
        
        linea=(int)(Math.random() * 95) + 32;
        System.out.print((char)linea); // Esto transformara el numero en un char 

      }
  }
}
