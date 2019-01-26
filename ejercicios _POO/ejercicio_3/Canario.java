/*
 *Canario
 * 
 * 
 */


public class Canario extends Ave {
	
//atributos
    
    private String ColorPelaje;
    
    public Canario (String Name) {  // al crear un mamifero siempre vamos a tener que ponerle nombre como hemos definido en la clase Animal
       super(Name);              //se pone en super el elemento que ira a el atributo que hemos puesto que es obligatorio en Animal
     
    }
    
    //Metodos
    
    
     public void Pia() {
      System.out.println("PioPioPio");
    }
    
    public void sonido() {
      System.out.println("priiiiuuu priiiiuuuu");
    }
    
     public void Baila() {
      System.out.println("No bailo soy un Canario");
    }
    
    public void clase() {
      System.out.println("SOY UN CANARIO :> ");
    }
    
    
	
	
}

