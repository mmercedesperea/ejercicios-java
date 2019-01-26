/*
 *PERRO
 * 
 */


public class Perro extends Mamifero  {
  
  
  //atributos
    
    private String Raza;
    private String ColorPelaje;
    
    public Perro (String Name) {  // al crear un mamifero siempre vamos a tener que ponerle nombre como hemos definido en la clase Animal
       super(Name);              //se pone en super el elemento que ira a el atributo que hemos puesto que es obligatorio en Animal
      this.Raza = "Mix";
      this.ColorPelaje = "Negro";
    }
    
    
    //Metodos
    
   public String getRaza(){                  // Se genera un metodo que al llamarlo devolvera el nombre del animal, los metodos get devuelven 
      return this.Raza;
    }
     
    public void setRaza(String raza){  //para almacenar raza
      this.Raza=raza;
    }
 
    public String getColorPelaje(){         // Se genera un metodo que al llamarlo devolvera el nombre del animal, los metodos get devuelven 
      return this.ColorPelaje;
    
    }
    
     public void setColorPelaje(String color){  //para almacenarcolor
      this.ColorPelaje=color;
    }
    
     public void Ladra() {
      System.out.println("ARGGGGGG GUAU GUAU");
    }
    
    public void sonido() {
      System.out.println("GUAU GUAU");
    }
    
     public void Pata() {
      System.out.println("Toma mi pata");
    }
    
    public void clase() {
      System.out.println("SOY UN PERRO");
    }
    
    
	
	
}

