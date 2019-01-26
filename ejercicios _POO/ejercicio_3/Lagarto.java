/*
 *Lagarto
 * 
 * 
 */


public class Lagarto extends Animal {
	
	//atributos
    
    private String Tamano;
    private String Color;
    
    public Lagarto (String Name) {  // al crear un mamifero siempre vamos a tener que ponerle nombre como hemos definido en la clase Animal
       super(Name);              //se pone en super el elemento que ira a el atributo que hemos puesto que es obligatorio en Animal
      this.Tamano = "Pequeño";
      this.Color = "Verde";
    }
    
    
    //Metodos
    
   public String getTamano(){                  // Se genera un metodo que al llamarlo devolvera el tamaño
      return this.Tamano;
    }
     
    public void setTamano(String longitud){  //para almacenar tamaño
      this.Tamano=longitud;
    }
 
    public String getColor(){         // Se genera un metodo que al llamarlo devolvera el color
      return this.Color;
    
    }
    
     public void setColor(String color){  //para almacena rcolor
      this.Color=color;
    }
    
     public void Ladra() {
      System.out.println("Soy un lagarto no ladro");
    }
    
    public void sonido() {
      System.out.println("Gluo Gluo");
    }
    
     public void bano() {
      System.out.println("Me gusta sumergirme en el agua");
    }
    
     public void Sol() {
      System.out.println("Disfruto mucho tomando el sol");
    }
    
    public void clase() {
      System.out.println("SOY UN LAGARTO");
    }
    
  }
    
