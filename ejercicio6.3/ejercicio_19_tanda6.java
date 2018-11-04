/*Ejercicio 19
Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
luego el máximo de los pares el mínimo de los impares y la media de todos los
números generados.*/


public class ejercicio_19_tanda6 {
  public static void main(String[] args) {
    
    int parmax=0;
    int imparmini=200;
    int suma=0;
    int contador=0;
    
    for(int i=0; i<50; i++){
      
      int numero=(int)(Math.random()*301)-100;
      System.out.print(numero+" ");
      suma= suma+numero;
      contador++;
      
      if (numero%2==0){
        int par=numero;
          if(par>=parmax){
            parmax=par;
            }
      }else{
        int impar=numero;
        if(impar<=imparmini){
          imparmini=impar;
          }
        }
  }  
    int media= suma/contador;
    System.out.print("\nEl numero maximo de los pares es : "+parmax);
    System.out.print("\nEl numero minimo de los impares es : "+imparmini);
    System.out.print("\nLa suma de todos los numeros da : "+suma);
    System.out.print("\nHa puesto un total de : "+contador+ " numeros");
    System.out.print("\nLa media de todos los numeros es : "+media);
  }
}
