/*
 1. Realice un programa que maneje un array de enteros cuyo tamaño se le indique al usuario,
para almacenar tantos enteros como se hayan reservado. Muéstrelos en pantalla en orden
inverso al que se han introducido. Sólo puede utilizar un array.
 * 
 * 
 */


public class ejercicio_refuerzo_1 {
	
	public static void main (String[] args) {
    int [] array =new int[10];
    
    System.out.println("Vamos a rellenar un array de 10 huecos, ve dandome numeros para ir colocandolos\nSe los mostrare en el orden inverso al introducido");
    
    for (int i=0;i<array.length;i++){
      array[i]=Integer.parseInt(System.console().readLine());
    }
      
    for (int i=array.length-1; i>=0;i--){
      System.out.print(array[i]+ " " );
    }  
    
	}
}

