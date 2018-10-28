/*Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado.El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).*/


public class ejercicio49_tanda5 {
  public static void main(String[] args) {
    
    int numero;
    int contador=0;
    int suma=0;
    int media=0;
    
   boolean primo =false;
    int mini=10000;
    int maxi=0;
    System.out.print("Por favor vaya introduciendo numeros enteros positivos. Para terminar intruduzca un numero primo\n");
  
    while (primo ==false){
      primo=true;
      
    numero= Integer.parseInt(System.console().readLine());

      for (int i=2; i <numero; i ++) {  
        if ((numero % i)==0){  
          primo= false;
        }
      } 
   
      if (primo==true){
      }else{
          contador++;
            
          suma=suma+numero;
          
          if(numero>maxi){
            maxi=numero;
          }
          
          if (numero<mini){
            mini=numero;
          }
        }
    }
    media=suma/contador;
    System.out.printf("El numero mas alto es %d \n", maxi);
    System.out.printf("El menor numero es %d \n",mini);
    System.out.printf("La suma es %d \n",suma); 
    System.out.printf("La cantidad de numeros introducidos es: %d \n",contador); 
    System.out.printf("La media es %d \n",media); 
  }
}
