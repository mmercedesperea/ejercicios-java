/*
 *Ejercicio 39
Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes
palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el
470213 convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien. Desde
la función no se debe mostrar nada por pantalla, solo se debe usar print desde
el programa principal. Fíjate que hay una coma detrás de cada palabra salvo
al final.
 * 
 */


public class ejercicio_39 {
	
public static void main (String[] args) {
        System.out.println("Vamos a pasar numeros a su palabra");
        String numero=System.console().readLine();
        
        System.out.print(convierteEnPalabras(numero));
	}
  
  //----------------------FUNCIONES

   
    //para sacar el string completo
    
  public static String convierteEnPalabras(String n){
    
    // sacamos la cantidad de cifras que tiene nuestro numero
    int cifras=0; 
    int contador=0;                        
    for (int i=0;i<n.length();i++){
      cifras++;
      contador++;
      }
      
    //pasamos el string a un int 
     int entero = Integer.parseInt(n);
      
    //da la vuelta a un numero
    int volteado = 0;
    while(contador > 0) {
      contador--;
        volteado = (volteado * 10) + (entero % 10);
        entero = entero / 10;
      }
    
    String palabra= "";
    int digito;
        
     //vamos construyendo nuestra palabra    
     while (cifras > 0) {
            cifras--;
            digito = volteado % 10;          //guardas el ultimo digito
            volteado = volteado / 10;                 
            palabra = numeroAPalabra(palabra, digito);
            if (cifras>0) {
              palabra=palabra + ", ";
              }      
        }
        return palabra;
  }
  
  //vamos sacando los diferentes caracteres segun el numero sumandolos segun se van acumulando
    private static String numeroAPalabra(String palabra, int n) {

          switch(n) {
            case 1:
            palabra = palabra+"uno"  ;
            break;
            
            case 2:
            palabra = palabra+"dos"  ;
            break;
            
            case 3:
            palabra = palabra+"tres";
            break;
            
            case 4:
            palabra = palabra+"cuatro"  ;
            break;
            
            case 5:
            palabra = palabra+"cinco"  ;
            break;
            
            case 6:
            palabra = palabra+"seis"  ;
            break;
            
            case 7:
            palabra = palabra+"siete"  ;
            break;
            
            case 8:
            palabra = palabra+"ocho";
            break;
            
            case 9:
            palabra = palabra+"nueve"  ;
            break;
            
            case 0:
            palabra = palabra+"cero"  ;
            break;
            
            default:
               palabra = "numero no valido";
             
          }

        return palabra;
    }  
  
}

