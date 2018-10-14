public class ejercicio7{
  public static void main (String [] args){
    
    double nota1;
    double nota2;
    double nota3;
  
    System.out.println("vamos a calcular la media de tres notas , introduce tres notas:");
    System.out.printf("Introduce la primera nota:");
      nota1 = Double.parseDouble(System.console().readLine());

    System.out.printf("Introduce la segunda nota:");
      nota2 = Double.parseDouble(System.console().readLine());

    System.out.printf("Introduce la tercera nota:");
      nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;
    System.out.printf("El resultado es %.2f \n", media);

}
} 
  
  
  
      

      



