/*
 * Ejercicio 35
Crea una función con la siguiente cabecera:
public static String convierteEnPalotes(int n)
Esta función convierte el número n al sistema de palotes y lo devuelve en una
cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
| - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
para comprobar que funciona bien. Desde la función no se debe mostrar nada
por pantalla, solo se debe usar print desde el programa principal.
 */

public class Ejercicio_35 {
	public static void main (String[] args) {
    System.out.println("Vamos a pasar numeros al sistema palotes");
    int numero= Integer.parseInt(System.console().readLine());
  
    System.out.print(convierteEnPalotes(numero));
  }

//-----------------------------------FUNCIONES----------------------------------//

//da la vuelta a un numero
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
      }
    long volteado = 0;
    while(x > 0) {
        volteado = (volteado * 10) + (x % 10);
        x = x / 10;
      }
    return volteado;
  }

//-------------------------------FUNCION PARA PASAR UN ENTERO A PALOTES-----------------------------------
    public static String convierteEnPalotes(int n) {    
      n = (int)voltea(n);   
     
      int[] xarrayaux = new int[1000];                         // creamos un array auxiliar
      int i=0;   
     
      while(n>0){                                              // vamos a pasar el numero original a un array
         xarrayaux[i]=n%10;                                   // vamos almacenando el ultimo digito del array en las primeras posiciones del array
         n=n/10;                                              // vamos acortando el numero original quitandole numeros por la cola 
         i++;                                                 //vamos almacenando contadores que nos sirvan para saber el numero d edigitos que tiene nuestro numero base
       }
      int[] xarray = new int[i];                          
      
      //guardamos el resultado anterior en un array con las dimensiones que necesitamos 
      for(int l=0;l<i;l++){
        xarray[l]=xarrayaux[l];
        }
        
        //-------------ahora pasamos a trabajar con el array resultante para sacar los palotes en una string
      String palo="";
      String[] palotesaux= new String[xarray.length];
       
      //Para pasar los valores de cada elemento del array xarray a un array string que contenga tantos palitos como sea necesario
      for(int k=0;k<xarray.length;k++){
        String[] palotes= new String[xarray[k]]; // la string palotes tendra la longitud del valor que se encuentre en la casilla numero k carroespondiente al array xarray en cada pasada
        for(int a=0;a<xarray[k];a++){
            palotes[a]="|";                     // palotes almacena un | en cada casilla hasta llenar el numero que se encuentra en la casilla numero k de xarray
           }
        
        //pasamos el array de string a un string normal 
        palo = String.join("",palotes);   //para pasar el contenido de un array de string a un string 
        palotesaux[k]=palo;              // almacenamos el resultado de cada pasada a string a un hueco de un array de string
              
        //reiniciamos los valores del array palotes para que pueda almacenar mas palotes
        for(int s=0;s<palotes.length;s++){
            palotes[s]=" ";
          }
      }
           
      String palo2 = String.join("-", palotesaux);   // pasamos el array palotesaux a un string 
       
      return palo2;
    } 
}
