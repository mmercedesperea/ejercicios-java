/*
 * Pinguino
 * 
 * 
 */



public class Pinguino extends Ave {
	
	//atributos
    
    private String Tamano;
    private String Color;
    
    public Pinguino (String Name) {  // al crear un mamifero siempre vamos a tener que ponerle nombre como hemos definido en la clase Animal
       super(Name);              //se pone en super el elemento que ira a el atributo que hemos puesto que es obligatorio en Animal
      this.Tamano = "Pequeño";
      this.Color = "Negro";
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
    
     public void Baila() {
      System.out.println("A los pinguinos nos gusta bailar");
    }
    
    public void sonido() {
      System.out.println("cuakkk cuakkkkk");
    }
    
     public void OsoPolar() {
      System.out.println("Me dan mucho miedo los osos polares");
    }
    
    public void clase() {
      System.out.println("SOY UN PINGUINO");
    }
    
  }
    


