/*
Ejercicio 3
Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.
 * 
 * 
 */


public abstract class Animal {   //el abstract define que esta clase no va a tener instancias , y funcionara como clase principal d euna serie de subclases
  
  //atributos de clase, solo existira una variable para todas las clases que se ira acumulando 
  
   private static int sonidosEmitidos=0;
   private static int comidaDada=0;
  
  // atributos de instancia
   
    private String nombre;
    private String raza;
    private int peso;
    private int edad;
    private String sexo;
    
    //metodos para la clase Animal
    
    	// cuando se mete static quiere decir que solo es uno en toda la clase
    public static int getsonidosEmitidos() {  //para mostrar los sonidos emitidos totales que se han ido almacenando de todos los animales 
      return Animal.sonidosEmitidos;
    }
    
     //metodos para las subclases  get muestra set modifica
     //constructores
  
    public Animal(String Name){            // ponemos los valores predefinidos de animal y voy a decir que por obligacion tiene que tener 
      
      this.nombre = Name;                       //This se usa para especificar que te refieres a este atributo de este objeto
      this.edad=-1;
      this.peso=-1;
      this.sexo = "No identificado";
      
    }
 
          //metodos que van a ir modificandose con SET
          
    public void setEdad(int time){    //para almacenar el la edad del animal
      this.edad=time;
    }
    
     public void setpeso(int pesoAnimal){  //para almacenar el peso
      this.peso=pesoAnimal;
    }
    
     public void setsexo(String sex){  //para almacenar el sexo
      this.sexo=sex;
    } 
    
    
    public void setsonidosEmitidos(int sound){    //para almacenar los sonidos emitidos
      this.sonidosEmitidos=sound;
    }
    
    /* public void setnombre(String nom){  
      this.nombre=nom;
    } */
    
          //metodos con acciones predefinidas
    
    public void dormir() {
      System.out.println("ZZzzzz ZZZzzz");
    }
    
    public void come(String comida) {
      if (comida.equals("Pienso")) {
        System.out.println("Hmmmm, ñammm ñammmm");
      } else {
        System.out.println("Lo siento, yo no como "+comida+ " solo como pienso");
        }
    }
    
    
    // metodos para mostrar elementos por pantalla GET mostrar
    
    public int getsonidosTotales(){
       return this.sonidosEmitidos;
    }
    
     public int getcomidaDada(){
       return this.comidaDada;
    }
    
    public String getNombre(){         // Se genera un metodo que al llamarlo devolvera el nombre del animal, los metodos get devuelven 
      return this.nombre;
    }
    
    public String getSexo(){         // Se genera un metodo que al llamarlo devolvera el nombre del animal, los metodos get devuelven 
      return this.sexo;
    }
    
     public int getEdad(){
       return this.edad;
    }
  
    // metodo para ir sumando los sonidos propios del animal y los sonidos que se van almacenando de todos los animales 
    
    public void sonidos(int k) {
      Animal.sonidosEmitidos += k;
    }
    
    // metodo para ir sumando los alimentos propios del animal y los alimentos que se van almacenando de todos los animales 
    
    public void alimento(int A){
      Animal.comidaDada +=A;
      }
      
  //una funcion para devolver por pantalla  todo lo que se haya modificado
  public String toString () {    
    String salida = "";
    
    salida= salida + "Nombre : " + this.nombre + "\n";
    salida= salida + "Sexo : " + this.sexo + "\n";
    
    if (this.peso>=0){
      salida = salida + "Peso : " + this.peso + " Kilos \n";
      }
        
    if (this.edad>=0){
      salida = salida + "Edad : " + this.edad + " ";
      }
      
    return salida;
    
  }
}

