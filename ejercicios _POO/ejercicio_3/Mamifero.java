/*
 * MAMIFERO
 * 
 * 
 */


public class Mamifero extends Animal {
	
      //atributos
    private boolean embarazo;
    private String embarazado;
    private String descendencia;
    private int tiempoGestacion;
    private boolean cria;
    
   /* public Mamifero (String sex) {
      super(sex);
      this.tiempoGestacion=0;
  }*/
  
    public Mamifero (String Name){   // al crear un mamifero siempre vamos a tener que ponerle nombre como hemos definido en la clase Animal
      super(Name);                  //se pone en super el elemento que ira a el atributo que hemos puesto que es obligatorio en Animal
      
      this.embarazado ="";
      this.descendencia="";
      this.tiempoGestacion= 0;
 
      }

     //metodos que van a ir modificandose con SET
      
    public void settiempoGestacion(int TempoGes){    
      this.tiempoGestacion=TempoGes;
    }
    
    // para almacenar el tiempo de embarazo
    public void setembarazado(String time){    
      this.embarazado=time;
        if (embarazado.equals("si")){
          this.embarazo = true;
      }else{
        this.embarazo =false;
      }
    }
    
     public void setdescendencia(String criaturas){    
      this.descendencia=criaturas;
        if (descendencia.equals("si")){
          this.cria = true;
      }else{
        this.cria =false;
      }
    }
 
     public void amamanta() {
       if (cria==true){
      if ((this.getSexo() == "Hembra")||(this.getSexo() == "Hermafrodita")) {
        System.out.println("Toma alimento, Bebe leche para crecer fuerte y grande");
      } else {
        System.out.println("No puedo dar el pecho ya que soy del sexo equivocado");
      }
    }else{System.out.println("No tengo ninguna cria ");}
    }
 
 public void gestar(){
  if ((embarazo==true)&&((this.getSexo() == "Hembra")||(this.getSexo() == "Hermafrodita"))){
    System.out.println("El tiempo de gestacion es "+tiempoGestacion );
    }
  
}
 
    //para devolver el tiempo de gestacion
  public int gettiempoGestacion(){         // los metodos get devuelven
      return this.tiempoGestacion;
    
  }   
}

