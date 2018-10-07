public class ejercicio6{
  public static void main (String [] args){
  
    int base;
    int altura;
    int area;
 
    System.out.println("Introduce la base:");
    base= Integer.parseInt(System.console().readLine());
  
    System.out.println("introduce la altura:");
    altura = Integer.parseInt(System.console().readLine());
  
    area= (base * altura) / 2;
    System.out.printf("El area del triangulo es: %d\n",area);
  
  }
}
