/*
3. Crea las funciones cuyas cabeceras se muestran a continuación:
public static String convierteArrayEnString(int[] a)
public static int[] concatena(int[] a, int[] b)
La función convierteArrayEnString toma como parámetro un array que contiene números y
devuelve una cadena de caracteres con esos números. Por ejemplo, si a = { },
convierteArrayEnString(a) devuelve  ; si a = { 8 }, convierteArrayEnString(a)
devuelve 8; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve 62501.
La función concatena toma dos arrays como parámetros y devuelve un array que es el resultado de
concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b)
devuelve { 8, 9, 0, 1, 2, 3 }.
Utiliza esta función en un programa para comprobar que funcionan bien.
 * 
 */


public class ejercicio_3_2 {
	
	public static void main (String[] args) {
    
     int [] cifras = {1,3,5,6,7,8,2};
    
    System.out.print(convierteArrayEnString(cifras));
    
    int [] ArrayA = {2,4,5,6,7,8,2};
     
    int [] ArrayB = {4,4,4,4,4,4,4};
    
    System.out.println();
    
    int [] concadenado = (concatena(ArrayA,ArrayB));
    
    for(int i=0;i<concadenado.length;i++){
        System.out.print(concadenado[i]);
      }

	}

//Funcion que convierte un array de int en un string
public static String convierteArrayEnString(int[] a){
  
  String numero="";
  
  for(int i=0;i<a.length;i++){
    numero= numero+ (Integer.toString(a[i]));
  }
  return numero;
  }
  
//concatena arrays
public static int[] concatena(int[] a, int[] b){
  
  //para sacar la longitud del array concadenado
  int cifras1=a.length;
  int cifras2=cifras1 + b.length;
 
  int [] arrayConca=new int[cifras2]; 
  
  //almacenamos los elementos del array a
  for(int i=0;i<a.length;i++){
    arrayConca[i]=a[i];
  }
    
  //almacenamos los elementos del array b  
    int contador=0;
  for(int i=a.length;i<arrayConca.length;i++){
    arrayConca[i]=b[contador];
    contador++;
  }
  
  return arrayConca;
  }
}
