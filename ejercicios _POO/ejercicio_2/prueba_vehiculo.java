/*
 Ejercicio 2
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra
a continuación:
 * 
 * VEHICULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
 * 
 */


public class prueba_vehiculo {
	
	public static void main (String[] args) {
    
    int opcion=0;
    int kmb=0;
    int kmC=0;
    
    //Instancias
    
    bicicleta moderna = new bicicleta();
    coche fiat = new coche();
    
    //Atributos
    
    moderna.marca="bwo";
    fiat.marca="fiat 3";
    
    //Menu
    
    while(opcion!=10){
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Que marca tiene mi coche");
      System.out.println("9. Que marca tiene mi bicicleta");
      System.out.println("10. Salir");
      System.out.print("Elige una opción (1-9):");
      
      opcion=Integer.parseInt(System.console().readLine());
      
      System.out.println();
      
      switch (opcion) {
        
        case 1:
        System.out.println("Cuantos kilometros quiere recorrer?");
        kmb=Integer.parseInt(System.console().readLine());
        moderna.recorre(kmb);    
        System.out.println();                                       // se almacena en recorre (en la clase vehiculo los km que recorre)
        break;
        
        case 2:
        moderna.caballito();
        System.out.println();
        break;
        
        case 3:
        System.out.println("Cuantos kilometros quiere recorrer?");
        kmC=Integer.parseInt(System.console().readLine());
        fiat.recorre(kmC);
        System.out.println();
        break;
        
        case 4:
        fiat.rueda();
        System.out.println();
        break;
        
        case 5:
        System.out.println("El kilometraje de su bicicleta es : ");
        System.out.println(moderna.getKilometrosRecorridos());  //llamamos al metodo kilometros recorridos por la bicicleta moderna , que se encuentra especificada en la clase principal vehiculo
        System.out.println();
        break;
        
        case 6:
        System.out.println("El kilometraje de su coche es : ");
        System.out.println(fiat.getKilometrosRecorridos());  //llamamos al metodo kilometros recorridos por la coche fiat, que se encuentra especificada en la clase principal vehiculo
        System.out.println();
        break;
        
        case 7:
        System.out.println("El kilometraje total de todos los vehiculos es : ");
        System.out.println(fiat.getKilometrosTotales());  //llamamos al metodo kilometros totales en vehiculo
        System.out.println();
        break;
        
        case 8:
        System.out.println("Su coche es un : ");
        System.out.println(fiat.marca);  //llamamos al atributo marca
        System.out.println();
        break;
        
          case 9:
        System.out.println("Su bicicleta es una : ");
        System.out.println(moderna.marca);  //llamamos al atributo marca
        System.out.println();
        break;
         
      }
     }
     System.out.print("\nHa salido del programa");
		
	}
}

