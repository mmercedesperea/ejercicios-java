/*Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo o
no.*/

public class ejercicio42_tanda5{
  public static void main (String[] args){
  
  int numero=0;
  
  boolean primo =true;

  System.out.print("Dame un numero entero positivo y te mostrare los 5 siguientes numero y te dire si son primos o no :\n");
    numero=Integer.parseInt(System.console().readLine());
    
    for( int i=numero;i<numero+5;i++){               // i es igual al numero introducido y en cada ronda ese numero se ira incrementando hasta llegar a ese numero mas 5
      primo=true;                                    // en cada ronda primo sera true al empezar 
      
      for( int a=2; a<numero; a++){                  // a sera igual a dos y llegara maximo al numero intrudicido que ira aumentnado cada turno gracias al bucle principal
        if(( i % a)==0){                             // si i que vale lo que numero, si en algun momento de su division entre A ( que A ira incrementando hasta llegar a numero) da 0 es que no es primo
          primo=false;                               // por lo tanto primo sera false 
        } 
      }
      
      if (primo==true){
        System.out.printf("%d Es primo\n",i);        // Si el numero es primo este se mostrara como primo
      }else{
        System.out.printf("%d No es primo\n",i);     // si no es primo se mostrara como no primo
          
       }
    }
  }
}
