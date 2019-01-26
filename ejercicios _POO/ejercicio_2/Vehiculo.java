/*
 Ejercicio 2
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra
a continuación:
* 
* 
* Salvo casos puntuales se seguirá la regla de declarar private las variables de
instancia y public los métodos.
 * 
 * 
 */


public abstract class Vehiculo {  //el abstract define que esta clase no va a tener instancias , y funcionara como clase principal d euna serie de subclases 
  
  //atributos de clase, solo existira una variable para todas las clases que se ira acumulando 
  
  private static int vehiculosCreados=0;                //empieza en 0 
  private static int kilometrosTotales=0;
  
  // atributos de instancia
    private int kilometrosRecorridos;
    
    
  //metodos
    
    	// cuando se mete static quiere decir que solo es uno en toda la clase
    public static int getKilometrosTotales() {  //para mostrar los kilometros totales que se han ido almacenando en vehiculo kilometroTotales
      return Vehiculo.kilometrosTotales;
    }

  //metodos para las subclases
  
    public Vehiculo() {
      this.kilometrosRecorridos = 0;           ////This se usa para especificar que te refieres a este atributo de este objeto, kilometros recorridos empieza en 0 
    }
    
    public int getKilometrosRecorridos() {     //para mostrar los kilometros recorridos por el propio vehiculo
      return this.kilometrosRecorridos;
    }
    
    // metodo para sumar los kilometros que ha recorrido el vehiculo propio conforme a todos los kilometros 
    public void recorre(int k) {
      this.kilometrosRecorridos += k;
      Vehiculo.kilometrosTotales += k;
    }

	
}

