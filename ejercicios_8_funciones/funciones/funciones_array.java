/*
 *Funciones para arrays de una dimension
 * 
 */

package funciones;
public class funciones_array {
	
     //generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];    // se genera un array de tamaño n
     
    for (int i = 0; i < n; i++) {
      x[i]=(int)(Math.random()*(maximo-minimo+1)+minimo);   // se rellena el array con numeros aleatorios que van entre el maximo fijado y el minimo
      }
      return x;
    }
  }
    
 
    
    
		
	


