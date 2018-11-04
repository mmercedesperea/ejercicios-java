/*Ejercicio 10
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @.
* 
*  Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.*/

public class ejercicio_10_tanda6 {
  public static void main(String[] args) {
    
    int simbolo=0;
    String caracter=" ";
    int longitud=0;
    
    for (int i=1; i<=10; i++){
      System.out.println();
      System.out.print("    ");
      
      simbolo=(int)(Math.random()*6)+1;
      switch (simbolo){
        case 1:
        caracter="+";
        break;
        case 2:
        caracter="-";
        break;
        case 3:
        caracter="=";
        break;
        case 4:
        caracter=".";
        break;
        case 5:
        caracter="|";
        break;
        case 6:
        caracter="@";
        break;        
        }
      longitud=(int)(Math.random()*40)+1;
      
      for(int l=1;l<=longitud; l++){
        System.out.print(caracter);
        }
    System.out.println();
      }
  }
}
