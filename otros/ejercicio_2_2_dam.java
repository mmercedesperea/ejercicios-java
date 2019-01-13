/*
 *2. Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe introducir la altura.
En esa altura va incluida la estrella y el tronco. Suponemos que el usuario introduce una altura mayor
o igual a 4.
 * 
 * 
 */


public class ejercicio_2_2_dam {
	
	public static void main (String[] args) {
    
    System.out.print("Deme la altura de su arbol de navidad");
    int altura=Integer.parseInt(System.console().readLine());
    
    int contadorEspa=1;

    //para la estrella
     System.out.println();
      for(int t=2;t<=altura-2;t++){
        System.out.print(" ");
        }
        System.out.println("*");

    
    for (int i=1; i<altura-2; i ++ ) {  
        for(int j=3; j<=(altura-i); j++){  
         System.out.print(" ");         
        }
        System.out.print("#");        
        
        if (i>=2){                     
          for(int j=1; j<=contadorEspa;j++){  
            System.out.print(" ");          
          }
          System.out.print("#");       
          contadorEspa = contadorEspa + 2; 
        }
      System.out.println("");              
    }
     for (int a=1; a<=altura-2; a++){           
       System.out.print("# ");}
   
    //para el tronco
     System.out.println();
      for(int t=2;t<=altura-2;t++){
        System.out.print(" ");
      }
        System.out.println("#");

		
	}
}



