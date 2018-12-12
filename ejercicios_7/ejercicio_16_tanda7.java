/*Ejercicio 16
Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
array escribiendo los números que se quieren resaltar entre corchetes.*/


public class ejercicio_16_tanda7 {
  public static void main(String[] args) {
    
     int [] numero=new int [20];
     
     System.out.print("Estos son 20 numeros generados aleatoriamente : \n");
     
     // LLenamos el aray con 20 numeros aleatorios del 0 al 400
     for(int i=0; i<20; i++){
        numero[i]=(int)(Math.random()*401);  
      }
      // mostramos los numeros
      for(int i=0; i<20; i++){
        System.out.print(numero[i]+ " "); 
      }
      System.out.println(" \n");
      
      // Se pregunta al usuario si quiere resaltar los multiplos de 5 o de 7 
      System.out.print ("¿Quiere resaltar los multiplos de 5 o los multiplos de 7 ? \nEscribe 5 o 7 segun desee : ");
        int multiplo=Integer.parseInt(System.console().readLine());
         
      System.out.println();
      
      // Si el multiplo elegido es 5 entonces....
      if (multiplo==5){
        System.out.print("Los multiplos de 5 se muestran entre corchetes \n");
        for(int i=0; i<20; i++){
            if (numero[i] % 5 ==0){
              System.out.print( " [" + numero[i] + "] ");
              }else {System.out.print ( " " + numero[i] + " ");}
          }
          
      //si el multiplo elegido es 7 entonces....
        }else if (multiplo==7){
          System.out.print("Los multiplos de 7 se muestran entre corchetes \n");
          for(int i=0; i<20; i++){
            if (numero[i] % 7 ==0){
               System.out.print(" [" + numero[i] + "]");
              }else {System.out.print (" " + numero[i] + " ");}
          }
          }else {System.out.print("El multiplo no es valido tiene que elegir entre 5 o 7 ");}
         
  }
}
