/*
 * 
 Gato
 * 
 */

public class Gato extends Mamifero {

    //atributos
    
    private String Raza;
    private String ColorPelaje;
    
    public Gato (String Name) {  // al crear un mamifero siempre vamos a tener que ponerle nombre como hemos definido en la clase Animal
       super(Name);              //se pone en super el elemento que ira a el atributo que hemos puesto que es obligatorio en Animal
      this.Raza = "Comun Europeo";
      this.ColorPelaje = "Tricolor";
    }
    
    public String getRaza(){                  // Se genera un metodo que al llamarlo devolvera el raza del animal, los metodos get devuelven 
      return this.Raza;
    }
     
    public void setRaza(String raza){  //para almacenar raza
      this.Raza=raza;
    }
 
    public String getColorPelaje(){         // Se genera un metodo que al llamarlo devolvera el color del animal, los metodos get devuelven 
      return this.ColorPelaje;
    
    }
    
     public void setColorPelaje(String color){  //para almacenarcolor
      this.ColorPelaje=color;
    }
    
    //metodos con acciones predefinidas
    
    public void ronronea() {
      System.out.println("mrrrrrr mrrrrrr");
    }
    
    public void sonido() {
      System.out.println("Miiiauuuu miauuuuu");
    }
    
    public void clase() {
      System.out.println("SOY UN GATO :3");
    }
    
    
    
    
  


}
