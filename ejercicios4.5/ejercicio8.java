public class ejercicio8{
  public static void main (String [] args){
    
    double nota1;
    double nota2;
    double nota3;
  
    System.out.println("vamos a calcular la media de tres notas , introduce tres notas:");
    System.out.printf("introduce la primera nota:");
      nota1 = Double.parseDouble(System.console().readLine());

    System.out.printf("Introduce la segunda nota:");
      nota2 = Double.parseDouble(System.console().readLine());

    System.out.printf("Introduce la tercera nota:");
      nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;
    System.out.printf("El resultado es %.2f \n", media);


    if ((media >= 0)&&(media < 5)){
      System.out.println ("Su nota es insuficiente");
    } 
    else if ((media >= 5)&&(media < 6)){
      System.out.println ("Su nota es suficiente");
    }
    else if ((media >= 6) && (media < 7)){
      System.out.println ("Su nota es un bien");
    }
    else if ((media >=7)&&(media <8)){
      System.out.println ("Su nota es un notable");  
    }
    else if ((media >=9)&&(media <10)){
      System.out.println ("Su nota es un sobresaliente");
    }
}
} 
  
  
  
      

      



