/*
 *Ejercicio 3
  Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
  al menos, tres métodos específicos de cada clase y redefne el/los método/s
  cuando sea necesario. Prueba las clases creadas en un programa en el que se
  instancien objetos y se les apliquen métodos. 
  * 
  * PROGRAMA para probar las clases
 */

public class ejercicio03 {
  public static void main (String[] args) {
    
  //GATO 
    Gato gordo = new Gato("Gamera");
    
    gordo.clase();
    gordo.setEdad(5);
    gordo.setpeso(7);  
    gordo.setsexo("Hembra");   
    gordo.setRaza("Persa");
    gordo.setembarazado("No");  
    gordo.setdescendencia("si");
    gordo.settiempoGestacion(5);
    
    System.out.println(gordo); //muestra todo lo que por defecto le he dicho que muestre de animal
    
    
    System.out.println("Raza: : "+gordo.getRaza());
    System.out.println("Color : " +gordo.getColorPelaje());

    //System.out.println("El tiempo de gestacion es: "+gordo.gettiempoGestacion()); //para llamar al metodo getPeso
    System.out.println();
    
    System.out.println("Hola,animalito!");
    gordo.sonido();
    gordo.sonidos(1);
     System.out.println();
    
    System.out.println("Voy a acariciarte");
    gordo.ronronea();
    gordo.sonidos(1);
     System.out.println();
    
    System.out.println("Toma un poco de comida (dar patatas fritas)");
    gordo.come("Patatas fritas");
    gordo.alimento(1);
     System.out.println();
    
    System.out.println("Toma un poco de comida (dar pienso) ");
    gordo.come("Pienso");
    gordo.alimento(1);
     System.out.println();
    
    System.out.println("Alimenta a tu cria");
    gordo.amamanta();
    gordo.gestar();
     System.out.println();
     
     
     //Lagarto
     
     Lagarto verde = new Lagarto("Pepe");
     
    verde.clase();
    verde.setEdad(2);
    verde.setpeso(20);  
    verde.setsexo("Macho");   
    verde.setTamano("Muy Grande");
    
     
    System.out.println(verde);
    System.out.println("Color: "+verde.getColor());
    System.out.println();
    
     System.out.println("Hola,animalito!");
    verde.sonido();
    verde.sonidos(1);
     System.out.println();
     
    
    System.out.println("Ladra lagarto!");
    verde.Ladra();
    
    verde.Sol();
    System.out.println();
    
    System.out.println("Toma un poco de comida (dar pienso) ");
    gordo.come("Pienso");
    gordo.alimento(1);
     System.out.println();
    
    //Canario
    
     Canario amarillo = new Canario("Piolin");
     
     amarillo.clase();
     amarillo.setEdad(1);
    amarillo.setpeso(1);  
    amarillo.setsexo("Macho"); 
     
     System.out.println(amarillo);
     
      System.out.println();
     
     
     System.out.println("Hola,animalito!");
    amarillo.sonido();
    amarillo.sonidos(1);
     System.out.println();
     
     System.out.println("Pon un huevo!");
    amarillo.ponHuevo();
     System.out.println();
     
      System.out.println("Vuela!");
    amarillo.Vuela();
     System.out.println();
     
    System.out.println("\nSonidos emitidos por todos los animales : "+gordo.getsonidosTotales()); //esto llama a un metodo de la clase animal que esta almacenando todos los sonidos de animales que se van realizando
    System.out.println("Comidas dadas a todos los animales : "+gordo.getcomidaDada()); //esto llama a un metodo de la clase animal que esta almacenando todos los sonidos de animales que se van realizando
    
	}
  
}


