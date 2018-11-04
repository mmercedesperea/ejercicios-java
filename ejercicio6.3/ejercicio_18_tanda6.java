/*Ejercicio 18
Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
violeta y naranja.*/

public class ejercicio_18_tanda6 {
  public static void main(String[] args) {
    
    int color=0;
    String color1=" ";
    String color2=" ";
    String color3=" ";
    String colors= " ";
    int c = 0;
    int c1=0;
    int c2=0;
    int c3=0;
    //ve sacando numeros aleatorios hasta que no coincidan entre ellos
    do {
        c1 = (int)(Math.random() * 6);
        c2 = (int)(Math.random() * 6);
        c3 = (int)(Math.random() * 6);
    } while ((c1 == c2) || (c1 == c3) || (c2 == c3));
    
    //Se asignan numeros de colores
    for(int i=0;i<3;i++){
      
      switch(i) { 
        case 0:
        c = c1;
        break;
        case 1:
        c = c2;
        break;
        case 2:
        c = c3;
        break;
      }
     //se selecciona el color relacionado con el numero dado a C
      switch (c){
        case 0:
        colors="Rojo";
        break;
        case 1:
        colors="Azul";
        break;
        case 2:
        colors="Verde";
        break;
        case 3:
        colors="Amarillo";
        break;
        case 4:
        colors="Violeta";
        break;
        case 5:
        colors="Naranja";
        break;
        }
      // se le asigna el color a la string color correspondiente.
      switch (i){
        case 0:
        color1=colors;
        break;
        case 1:
        color2=colors;
        break;
        case 2:
        color3=colors;
        break; 
      }
    }
    // se muestran los colores.
    System.out.print(color1+"\n");
    System.out.print(color2+"\n");
    System.out.print(color3+"\n");
  }
}
