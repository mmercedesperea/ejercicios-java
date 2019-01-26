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

public class coche extends Vehiculo {
  
public String marca;
    
  public void pita() {
    System.out.println("piiiiii piiiiii");
    }
    
  public void andacoche() {
    System.out.println("Vamos de paseo pi pi pi en un coche feooo");
    }
   
  public void rueda() {
    System.out.println("rummmmmm rummmmmmmm");
    }
    
  public String getmarca(){         // Se genera un metodo que al llamarlo devolvera la marca por pantalla, los metodos get devuelven 
    return this.marca;
    
  }

}

