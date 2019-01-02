/*
 * Ejercicio 35
Crea una función con la siguiente cabecera:
public static String convierteEnPalotes(int n)
Esta función convierte el número n al sistema de palotes y lo devuelve en una
cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
| - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
para comprobar que funciona bien. Desde la función no se debe mostrar nada
por pantalla, solo se debe usar print desde el programa principal.
 * 
 * 
 */
public class Ejercicio_35_2 {
    public static void main(String[] args) {
        System.out.println("Vamos a pasar numeros al sistema palotes");
        int numero= Integer.parseInt(System.console().readLine());
       
        System.out.println(convierteEnPalotes(numero));
    }
    
    //----------------------------------------------FUNCIONES
    //volteamos
    private static int voltea(int x) {
        if (x < 0) {
            return -voltea(-x);
        }
        int volteado = 0;
        while (x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x = x / 10;
        }
        return volteado;
    }
  
     //pintamos los palitos en el string
     private static String convierteEnPalotes(int x) {
       int n=voltea(x);
        
        String resultado = "";  
        int digitoIndividual;
        
     while (n > 0) {
            digitoIndividual = n % 10;          //guardas el ultimo digito
            n = n / 10;                 
            resultado = palos(resultado, digitoIndividual) + "-";      // resultado va a ir almacenando lo que va generando la funcion palitos
        }
        
        return resultado;
  }
  
   //vamos sacando los palitos
    private static String palos(String palitos, int n) {

        for (int i = 0; i < n; i++) {
            palitos =palitos + '|';    // vamos almacenando palitos hasta la cantidad del numero que este en n  
        }

        return palitos;
    }      
}
