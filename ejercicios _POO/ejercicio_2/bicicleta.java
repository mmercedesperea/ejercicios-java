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
 */

public class bicicleta extends Vehiculo {
  
  public String marca;


  public void andaBici() {
    System.out.println("laa voy en mi biciii laaa laaa");
    }
    
  public void pita() {
    System.out.println("piiiiii piiiiii");
    }
    
  public void caballito() {
    System.out.println("ihhhhhhhhhhh");
    }
    
    
  public String getmarca(){         // Se genera un metodo que al llamarlo devolvera la marca por pantalla, los metodos get devuelven 
    return this.marca;
    
  }

}

