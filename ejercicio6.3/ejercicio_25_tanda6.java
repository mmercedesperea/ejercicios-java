/*Ejercicio 25
Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria
en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
*/


public class ejercicio_25_tanda6 {
  public static void main(String[] args) {
    
    for(int i=0;i<100;i++){
       boolean primo =true;
      
        int numero=(int)(Math.random()*191)+10;
        
        for (int o=2; o < numero; o ++){
            if ((numero % o)==0){  
              primo= false;
            }
        } 
        
      if (primo==true){
        System.out.print(" #"+numero+"#");
        } else if ((numero%5)==0){
        System.out.print(" ["+numero+"] ");
        }else {                                      
            System.out.print(" " +numero+ " ");
        }
         System.out.println();
    }
  }
}
