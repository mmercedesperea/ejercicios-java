/*Ejercicio 17
Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, 
* 
* que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. 
* 
* 
* Dentro
de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*           *
* &         *
* * * * * * * */

public class ejercicio_17_tanda6 {
  public static void main(String[] args) {
    
    int anchura=0;
    int altura=0;
    int posicionPez=0;
    
    System.out.print("Vamos a pintar un acuario\n");
    System.out.print("Dame el ancho que quieres que tenga (como minimo 4)\n");
    anchura=Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora dame la altura (como minimo 4)\n");
    altura=Integer.parseInt(System.console().readLine());
    
    int pez = (int)(Math.random()*(altura - 2)*(anchura - 2));   // le da un numero aleatorio sacado de la combinacion de altura y anchura.
    int pez2 = (int)(Math.random()*(altura - 2)*(anchura - 2));   // le da un numero aleatorio sacado de la combinacion de altura y anchura.
     
       //parte de arriba
    for (int i=1; i<=anchura; i++){             
      System.out.print("* "); 
      }
      System.out.println();
      
      //parte de en medio
     for(int a=1; a<=altura-2; a++){
       System.out.print("*");
       for (int o=1; o<=anchura-2; o++){
         if (posicionPez == pez){             // si la posicion llega al linea en la que la anchura y altura que se le ha dado a pez coincide.
           System.out.print("& ");            //pinta el pez. 
           }else {                         
           System.out.print("  ");           //se pintan los espacios
          }
       posicionPez++;                        //por cada vez que se hace el for anterior posicionPez aumentara 1.
     }
      System.out.print(" *\n");
      } 
      //linea de cierre de abajo
     for (int i=1; i<=anchura; i++){
      System.out.print("* "); 
      }
  }
}
