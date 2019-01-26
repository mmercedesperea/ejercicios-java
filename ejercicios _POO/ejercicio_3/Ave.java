/*
 * AVE
 * 
 */



public class Ave extends Animal {
  
	
	  //atributos
    
    private String Voladora;
    private String ColorPredominante;
    
    
    //Constructores
    
    public Ave (String Name){   // al crear un Ave siempre vamos a tener que ponerle nombre como hemos definido en la clase Animal
      super(Name);                  //se pone en super el elemento que ira a el atributo que hemos puesto que es obligatorio en Animal
      this.ColorPredominante ="Marron";
      this.Voladora ="Si";
 
      }
      
    //metodos
    
    public void setVoladora(String vuela){  //para almacenar si vuela o no
      this.Voladora=vuela;
    }
    
    public String getVoladora(){         // Se genera un metodo que al llamarlo devolvera si vuela o no el animal, los metodos get devuelven 
      return this.Voladora;
    }
    
    public void ponHuevo() {
      if (this.getSexo() == "Macho") {
        System.out.println("No puedo poner huevos ya que soy del sexo equivocado");
      } else {
      System.out.println("Se ha generado un huevo");
        }
    }
    
     public void Vuela() {
      if (this.getVoladora() == "Si") {
        System.out.println("Estoy volando!!!");
      } else {
      System.out.println("No puedo volar");
        }
    }
    
    public void pia() {
      System.out.println("pio pio pio");
    }
    
    
}

