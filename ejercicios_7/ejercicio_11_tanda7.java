/*Ejercicio 11
Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. 
* 
* Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que
no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
el array resultante.*/

public class ejercicio_11_tanda7 {
  public static void main(String[] args) {
    
     int [] numero=new int [10];
     int [] primos=new int [10];
     int [] noprimo=new int [10];
     int p=0;
     int n=0;
     int o=0;
     int i;
    
     System.out.print("Ve dandome numeros hasta llegar a 10 numeros intreoducidos :\n");
    
    for (i=0; i<10;i++){
      
     numero[i]=Integer.parseInt(System.console().readLine());
   }
   
    for (i=0; i<10;i++){
      boolean primo =true;
      
        for(int a=2; a<numero[i]&& primo==true;a++)
     
      if ((numero[i] % a)==0){  //Esto hace que se compruebe que el numero dividido entre i el resto es 0 primo sera false.
        primo= false;
       
       }
      if (primo==true){
        primos[p]=numero[i];
        p++;
         
      }else {
        noprimo[n]= numero[i];
        n++;
        }
        
    }
     //mostramos los numeros del 0 al 9
    for (i=0; i<10;i++){ 
    System.out.print(i + " | ");
    }
    System.out.println();
     // se va a pintar lineas intermedias 
     for (i=0; i<10;i++){ 
    System.out.print( "----");
    }
    System.out.println();
     // se muestran los numeros que ha introducido el usuario
     for (i=0; i<10;i++){ 
    System.out.print(numero[i] + " | ");
    }
     System.out.println();
     
     //--------------------------------------------------------------------//
       System.out.println();
     
     // Los números primos se menten en las primeras posiciones del array original
     
    for (i = 0; i < p; i++) {
    numero[i] = primos[i];
    }
    // Los números que no son primos se colocan al final.
    for (i = p; i < p + n; i++) {
    numero[i] = noprimo[i - p];
    }

    //---------------------------------------------------------------//
         
     
       //mostramos los numeros del 0 al 9
    for (i=0; i<10;i++){ 
    System.out.print(i + " | ");
    }
    System.out.println();
     // se va a pintar lineas intermedias 
     for (i=0; i<10;i++){ 
    System.out.print( "----");
    }
    System.out.println();
     // se muestran los numeros que ha introducido el usuario
     for (i=0; i<10;i++){ 
    System.out.print(numero[i] + " | ");
    }
  
  }
}
