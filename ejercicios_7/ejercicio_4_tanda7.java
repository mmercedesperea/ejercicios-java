/*Ejercicio 4
Define tres arrays de 20 números enteros cada una, con nombres numero,
cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
array cuadrado se deben almacenar los cuadrados de los valores que hay en el
array numero. 
* 
En el array cubo se deben almacenar los cubos de los valores que
hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
en tres columnas.*/



public class ejercicio_4_tanda7 {
  public static void main(String[] args) {
    
    int [] numero= new int [20];  
    int [] cuadrado= new int [20];
    int [] cubo= new int [20];
    
    int i;
    
    for(i=0;i<20;i++){
      numero[i] = (int) (Math.random ()*101);        //rellenamos los valores de numero con numeros aleatorios entre el 0 y el 100   
      cuadrado[i]=numero[i]*numero[i];               //sacamos el numero cuadrado, osea multiplicando el numero 1 por el numero 1 cuadrado(el numero x si mismo)
      cubo[i]=cuadrado[i] *numero[i];                //el cubo es el numero multiplicado por 3
    }
    
    for (i = 0; i < 20; i++) {  
    System.out.printf("El numero es  %d    el cuadrado es  %d   y el cubo es %d \n",numero[i],cuadrado[i],cubo[i]);  
    }
    
  }
}
