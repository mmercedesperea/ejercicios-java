/*
  Ejercicio 4
  Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
  los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 */


public class prueba_fraccion {
	
	public static void main (String[] args) {
    
    Fraccion PrimeraF =new Fraccion(12,20);
    
    System.out.println(PrimeraF);
    
		System.out.println(PrimeraF.multiplica(2));
    
    System.out.println(PrimeraF.invierte());
    
    System.out.println("La fraccion simplificada es igual a: " + PrimeraF.simplifica());
    
    System.out.println("La fraccion dividida por 2 es igual a: " + PrimeraF.divide(2));
	}
}

