/*
 * 6. Repita el ejercicio 3, pero haciendo uso de funciones. Tendrá que implementar 2 funciones,
  cuyas declaraciones son:
  (a) public static int[] creaYRellena (void)
  Pedirá al usuario el tamaño del array, realizará la reserva de memoria y pedirá al usuario
  todos los valores del array. Devuelve el array.
  * 
  (b) public static void invierteVector (int[] vector)
  Se le pasará un vector de enteros, el cual será manipulado para su inversión:
  intercambiará primero y último elementos, segundo y penúltimo, … y así sucesivamente
  hasta conseguir que el vector esté al revés de como llegó. No puede utilizar vectores
  auxiliares dentro, aunque sí variables enteras auxiliares.
 * .----------------------------------.
 * 3. utilizar sólo un array. En dicho array debe recoger los datos introducidos por el usuario, en el orden en el que los
  introdujo, invertir el array utilizando sólo ese array (puede usar variables auxiliares que no
  sean arrays) y presentar por pantalla los datos en el orden en el que se introdujeron y en el
  orden invertido.
 */

public class ejercicio_refuerzo_6 {
	
	public static void main (String[] args) {
     int [] array= creaYRellena();
     
      int [] array2= invierteVector(array);
 
       for(int i=0;i<array2.length;i++){
    System.out.print(array2[i]);
  }
  }
	
  //--------------------FUNCIONES----------------------------------------------
  
  public static int[] creaYRellena (){
    System.out.println("Deme el tamaño del array con el que quiere trabajar");
    int longitud=Integer.parseInt(System.console().readLine());
    
    int [] array= new int [longitud];  // generamos un array con la reserva de memoria introducida por el usuario
    
    for(int i=0;i<array.length;i++){
      System.out.print("Ve dandome numeros para rellenar el array : ");
      array[i]=Integer.parseInt(System.console().readLine());
      }
      
    for(int i=0;i<longitud;i++){
      System.out.print(array[i]+ " ");
      }  
      
      return array;
  
    }
    
    
    public static int[] invierteVector (int[] vector){
      int contador=0;
      int aux=0;
      
      for(int i=0;i<vector.length-1;i++){
        contador++;
        }
     
//Para dar la vuelta al array sin usar otro array
      for(int i=0;i<vector.length/2;i++){
        int aux1=vector[i];
        int aux2=vector[contador];
        vector[contador]=aux1;
        vector[i]=aux2;
        contador--;
        }

      return vector;
      }
  
}




