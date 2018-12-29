/*
 * Ejercicios del 20 al 28
 */

import funciones.funciones_array;
public class ejercicios_20_28_funciones {
	
	public static void main (String[] args) {
    
    //rellenar un array 
    System.out.print("Vamos a generar un array de numeros aleatorios\n");
    System.out.println();
    System.out.print("Deme la longitud del array\n");
    int longitud=Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora vamos a decir el parametro del numero maximo que comprondra el array\n");
    int maximo=Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora deme el numero minimo que compondra el array\n");
    int minimo=Integer.parseInt(System.console().readLine());
    
    int[] a = (funciones.funciones_array.generaArrayInt(longitud,maximo,minimo));     // este array se generara con los valores indicados y segun lo especificado en la funcion destinada a ello
    
    System.out.print("Su array generado aleatoriamente entre los valores que ha decidido es: \n");
    //muestra el array
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+ " ");
      }
    System.out.println();
    System.out.println();
    
    //saca el maximo de un array
    int max=(funciones.funciones_array.maximoArrayInt(a));
    System.out.print("El maximo del array es: "+max+"\n");
    System.out.println();
    //saca el minimo de un array
    int min=(funciones.funciones_array.minimoArrayInt(a));
    System.out.print("El minimo del array es : "+min+"\n");
    System.out.println();
    //saca la media  de un array
    int media=(funciones.funciones_array.mediaArrayInt(a));
    System.out.print("La media del array es : "+media+"\n");
    
    System.out.println();
    //dice si un numero esta o no en el array
    System.out.print("Introduzca un numero y le dire si esta en el array o no\n");
    int numero = Integer.parseInt(System.console().readLine());
    if (funciones.funciones_array.estaEnArrayInt(a,numero)) {
      System.out.println("El " + numero + " esta en el array .");
      } else {
          System.out.println("El " + numero + " no esta en el array.");
            }
    System.out.println();
    
    //saca la posicion de un numero en el array
       System.out.print("Introduzca el numero del que quiere saber la posicion dentro del array \n");
    int numeposi = Integer.parseInt(System.console().readLine());
    int posicion=(funciones.funciones_array.posicionEnArrayInt(a,numeposi));
    System.out.print("La posicion es : "+posicion+"\n");
		
    System.out.println();
    //voltea un array 
    int[] volteado = (funciones.funciones_array.volteaArrayInt(a));     // este array se generara con los valores indicados y segun lo especificado en la funcion destinada a ello
    System.out.print("El array volteado es: \n");
    for(int i=0;i<a.length;i++){
      System.out.print(volteado[i]+ " ");
    }
    System.out.println();
   //Rota n posiciones a la derecha los números de un array.
    System.out.print("\nIntroduzca el numero de posiciones a la derecha que quiere mover su array\n");
    int n = Integer.parseInt(System.console().readLine());
    int[] rotado= (funciones.funciones_array.rotaDerechaArrayInt(a,n));   
    System.out.print("El array movido es: \n");
    for(int i=0;i<a.length;i++){
      System.out.print(rotado[i]+ " ");
    }
    System.out.println();
    //Rota n posiciones a la izquierda los números de un array.
    System.out.print("\nIntroduzca el numero de posiciones a la izquierda que quiere mover su array\n");
    int ni = Integer.parseInt(System.console().readLine());
    int[] rotado2= (funciones.funciones_array.rotaIzquierdaArrayInt(a,ni));   
    System.out.print("El array movido es: \n");
    for(int i=0;i<a.length;i++){
      System.out.print(rotado2[i]+ " ");
    }
    
    
    
	}
}

