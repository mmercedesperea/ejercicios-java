/*Ejercicio 15
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical | (Alt + 1). El final de la melodía se marca
con dos barras. 
d) La última nota de la melodía debe coincidir con la primera.
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||*/

public class ejercicio_15_tanda6 {
  public static void main(String[] args) {
    
    int nota=0;
    int melodia=0;
    int melodia1=4;
    int clave=0;
    
    melodia1=4* (int)(Math.random()*7 +1);
    
    for(int i=1; i<melodia1+1; i++){
        
      nota=(int)(Math.random()*7);
      
       if (i==melodia1){
        nota=clave;}
      
        switch (nota){
        
        case 0:
        System.out.print("Do");
        break;
        
        case 1:
        System.out.print("Re");
        break;
        
        case 2:
        System.out.print("Mi");
        break;
        
        case 3:
        System.out.print("Fa");
        break;
        
        case 4:
        System.out.print("Sol");
        break;
        
        case 5:
        System.out.print("La");
        break;
        
        case 6:
        System.out.print("Si");
        break;
      }
      
       if (i==1){
        clave=nota;
      }

      if (i%4==0){
        System.out.print("|");}
    }
    System.out.print("|");
  }
}
