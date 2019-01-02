/*
Ejercicio 40
Crea la función de manejo de arrays que tenga la siguiente cabecera y que
haga lo que se especifica en los comentarios (puedes incluirla en tu propia
biblioteca de rutinas):
public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
// que contienen el 7 (por ej. 7, 27, 782)
// que se encuentren en otro array que se
// pasa como parámetro. El tamaño del array
// que se devuelve será menor o igual al
// que se pasa como parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números que contienen 7
se conservan; es decir, si en el array x el número 875 se repite 3 veces, en el
array devuelto también estará repetido 3 veces. Si no existe ningún número
que contiene 7  en el array x, se devuelve un array con el número -1 como
único elemento.
 * 
 */


public class ejercicio_40 {
	
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
    
    
    // vamos a mostrar los numeros que contentan 7 
    int[] p = (funciones.funciones_array.filtraCon7(a));     // este array se generara con los valores indicados y segun lo especificado en la funcion destinada a ello
    
    System.out.print("Su array con numeros 7 es: \n");
    //muestra el array
    for(int i=0;i<p.length;i++){
        System.out.print(p[i]+ " ");
      }
    System.out.println();
    System.out.println();
   
	}
}

