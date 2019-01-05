/*
 *2. Modifique el programa anterior para invertir el orden de los elementos en el array, y
  presente los elementos tanto en el orden original en el que se introdujeron como en el orden
  inverso al que se introdujeron. Puede utilizar todos los arrays que desee.
 */


public class ejercicio_refuerzo_2 {
	
	public static void main (String[] args) {
    
    int [] array =new int[10];
    
    System.out.println("Vamos a rellenar un array de 10 huecos, ve dandome numeros para ir colocandolos");
    
    for (int i=0;i<array.length;i++){
      array[i]=Integer.parseInt(System.console().readLine());
    }
      
    System.out.println("La posicion del array en el orden inverso al que se ha introducido es: ");  
    for (int i=array.length-1; i>=0;i--){
      System.out.print(array[i]+ " " );
    }
    System.out.println();
    
    System.out.println("La posicion del array en el orden original al que se ha introducido es: ");
    for (int i=0; i<array.length;i++){
      System.out.print(array[i]+ " " );
    }
    
    
		
	}
}

