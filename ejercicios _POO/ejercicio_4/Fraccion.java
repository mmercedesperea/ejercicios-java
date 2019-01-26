/*
  Ejercicio 4
  Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
  los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 */


public class Fraccion {
	
//atributos

 int numerador;
 int denominador;
 
//metodos

  Fraccion(int numer,int denom){
    this.numerador = numer;                       //This se usa para especificar que te refieres a este atributo de este objeto
    this.denominador=denom;
  }
  
  
  int getnumerador(){         // Se genera un metodo que al llamarlo devolvera el numerador  por pantalla, los metodos get devuelven 
    return this.numerador;
  }
  
  int getdenominador(){         // Se genera un metodo que al llamarlo devolvera el denominador por pantalla, los metodos get devuelven 
    return this.denominador;
  }
  

//para devolver los resultados
  public String toString () {    
    String salida = this.numerador + "/" + this.denominador;
    return salida;
  }
  
   
  //MULTIPLICA
  public String multiplica(int x) {
    int multiplicacion=this.numerador * x;
    String multi="La multiplicacion de esta fraccion por " +x + " seria: "+ multiplicacion + "/" +  this.denominador;
    return multi;
  }
    
    //MULTIPLICA
  public String invierte() {
    String Inver= "La fraccion invertida es: " + this.denominador + "/" +  this.numerador;
    return Inver;
  }
    
    //DIVISION
  public Fraccion divide(int n) {  //Para devolver un nuevo objeto
     Fraccion div = new Fraccion (this.numerador, this.denominador * n);
     return div;
  }
  /*
      public Fraccion divide(int n) {
      return new Fraccion(this.numerador, this.denominador * n);
      }
      * */
      
      //SIMPLIFICA
  
  public Fraccion simplifica() {
    int nume = this.numerador;
    int deno = this.denominador;
      for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
        while (((nume % i) == 0) && ((deno % i) == 0)) {
          nume /= i;
          deno /= i;
        }
      }
    return new Fraccion(nume, deno);
  }

}

