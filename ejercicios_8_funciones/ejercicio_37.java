/*
Ejercicio 37
Crea una función con la siguiente cabecera:
public String convierteEnMorse(int n)
Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.
1 . _ _ _ _ 6 _ . . . .
2 . . _ _ _ 7 _ _ . . .
3 . . . _ _ 8 _ _ _ . .
4 . . . . _ 9 _ _ _ _ .
5 . . . . . 0 _ _ _ _ _
 * 
 * 
 */


public class ejercicio_37 {
	
	public static void main (String[] args) {
        System.out.println("Vamos a pasar numeros al sistema morse");
        String numero= System.console().readLine();
        
        System.out.print(convierteEnMorse(numero));
	}
  
   
  //----------------------FUNCIONES

   
    //para sacar el string completo
  public static String convierteEnMorse(String n){
    
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
    
    String morse= "";
    int digito;
        
     //vamos construyendo nuestra palabra    
     while (cifras > 0) {
            cifras--;
            digito = volteado % 10;          //guardas el ultimo digito
            volteado = volteado / 10;                 
            morse = tradu(morse, digito)+ "  ";
                  
        }
        return morse;
  }
  
  //vamos sacando los diferentes caracteres segun el numero sumandolos segun se van acumulando
    private static String tradu(String morse, int n) {

          switch(n) {
            case 1:
            morse = morse+". _ _ _ _"  ;
            break;
            
            case 2:
            morse = morse+". . _ _ _"  ;
            break;
            
            case 3:
            morse = morse+". . . _ _";
            break;
            
            case 4:
            morse = morse+". . . . _"  ;
            break;
            
            case 5:
            morse = morse+". . . . ."  ;
            break;
            
            case 6:
            morse = morse+"_ . . . ."  ;
            break;
            
            case 7:
            morse = morse+"_ _ . . ."  ;
            break;
            
            case 8:
            morse = morse+"_ _ _ . .";
            break;
            
            case 9:
            morse = morse+"_ _ _ _ ."  ;
            break;
            
            case 0:
            morse = morse+"_ _ _ _ _"  ;
            break;
            
            default:
               morse = "numero no valido";
             
          }

        return morse;
    }  
  
}

