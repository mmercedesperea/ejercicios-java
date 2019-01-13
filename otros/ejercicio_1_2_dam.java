/*
 *1. Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200 ambos incluidos y que
  los almacene en un array. A continuación se debe mostrar el contenido de ese array junto al índice (0
  – 9). Seguidamente el programa debe colocar de forma alterna y en orden los menores o iguales de
  100 y los mayores de 100: primero menor, luego mayor, luego menor, luego mayor… Cuando se
  acaben los menores o los mayores, se completará con los números que queden.
 * 
 */


public class ejercicio_1_2_dam {
	
	public static void main (String[] args) {
    
    System.out.println("De cuanto quiere que sea su array");
    int numAr=Integer.parseInt(System.console().readLine());
    
    int [] arrayOri= aleatorio(numAr); 
    
      System.out.print("indice");
      for (int i = 0; i < arrayOri.length; i++) {
        System.out.printf("%4d ", i);
      }
      System.out.println();
      
     System.out.print("Valor ");
     for(int i=0;i<arrayOri.length;i++){
     System.out.printf("%4d ",arrayOri[i]);       //rellenamos los valores de numero con numeros aleatorios entre el 0 y el 200
    }
    System.out.println();
    
    int [] arrayOrde= ordenado(arrayOri); 
    
          System.out.print("indice");
      for (int i = 0; i < arrayOri.length; i++) {
        System.out.printf("%4d ", i);
      }
      System.out.println();
      
     System.out.print("Valor ");
     for(int i=0;i<arrayOrde.length;i++){
     System.out.printf("%4d ",arrayOrde[i]);      
    }
	}
    
  //array aleatorio
  
  public static int [] aleatorio(int num){
    int [] arrayAl= new int [num]; 
    for(int i=0;i<num;i++){
     arrayAl[i] = (int) (Math.random ()*201);        //rellenamos los valores de numero con numeros aleatorios entre el 0 y el 200
    }
    return arrayAl;
  }
  
  public static int [] ordenado(int []num){
    int [] arrayaux0= num; 
    int [] arrayauxmayor= new int [arrayaux0.length]; 
    int [] arrayauxmenor= new int [arrayaux0.length]; 
    int [] ordenado1= new int [arrayaux0.length];
    int contador=0;
    int contadormenor=0;
    int contadormayor=0;
    
    for(int i=0;i<arrayaux0.length;i++){
      if (arrayaux0[i]<=100){
      arrayauxmenor[contadormenor]=arrayaux0[i];
      contadormenor++;
      contador++;
      }else if (arrayaux0[i]>100){
        arrayauxmayor[contadormayor]=arrayaux0[i];
        contadormayor++;
        contador++;
        }
    }
    int count=0;
    for(int i=0;i<contador;i++){
      ordenado1[i]=arrayauxmenor[count];
      count++;
      i++;
    }
    
    int count2=0;
    for(int i=0;i<contador;i++){
      if (ordenado1[i]==0){
      ordenado1[i]=arrayauxmayor[count2];
      count2++;
      }
    }
    
    for(int i=0;i<arrayaux0.length;i++){
      if (ordenado1[i]==0){
      ordenado1[i]=arrayauxmenor[count];
      count++;
      }
    }
    
    return ordenado1;
  }
 
}

