/*
Ejercicio 1
Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
instancias y aplicándole algunos métodos.
 * 
 */


public class caballo {
	
	//atributos
  
  String nombre;
  String raza;
  String color;
  String premios;
  int peso;
  int edad;
  boolean sexo;//false macho;true hembra
  
  
  //métosos(funciones que se aplican sobre los objetos) 
  
  caballo(String name,String sex){
    this.nombre = name;                       //This se usa para especificar que te refieres a este atributo de este objeto
    if (sex.equals("macho")){
      this.sexo= false;
    }else{
      this.sexo=true;
    }
    this.edad=-1;
    this.peso=-1;
    this.raza="";
  }
  
  
    //metodos 
  
  void setEdad(int time){
    this.edad=time;
    }
    
  void setPeso(int heavy){
    this.peso=heavy;
    } 
    
  void setRaza(String tipo){
    this.raza=tipo;
    }   
    
  void sonido() {
    System.out.println("ihhhh ihhhhh");
    }
  
  void come(String comida) {
    if (comida.equals("pienso")) {
    System.out.println("Hmmmm, gracias");
    } else {
    System.out.println("Lo siento, yo solo como pienso");
    }
  }
  //otro metodo para presentar la informacion 
  
  String getNombre(){         // Se genera un metodo que al llamarlo devolvera el nombre del caballo por pantalla, los metodos get devuelven 
    return this.nombre;
    
  }
  
  int getEdad(){         // Se genera un metodo que al llamarlo devolvera el nombre del caballo por pantalla, los metodos get devuelven 
    return this.edad;
    
  }
  
   int getPeso(){         // Se genera un metodo que al llamarlo devolvera el nombre del caballo por pantalla, los metodos get devuelven 
    return this.peso;
    
  }
  
   //una funcion para devolver por pantalla 
  public String toString(){
    
    String ficha=" ";
    
    ficha= "Nombre : " + this.nombre + "\n";
    
    if (this.sexo ==true){
    ficha = ficha + "Sexo : hembra\n";
    }else{ 
      ficha = ficha + "sexo : macho\n";
      }
      
    if (!this.raza.equals("")){
      ficha = ficha + "Raza : " + this.raza+ "\n";
      }
      
    if (this.peso>=0){
      ficha = ficha + "Peso : " + this.peso + " \n";
      }
      
    if (this.edad>=0){
      ficha = ficha + "Edad : " + this.edad + " \n";
      }
      
    return ficha;  
    
  }
 
}





