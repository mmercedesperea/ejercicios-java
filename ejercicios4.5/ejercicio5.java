public class ejercicio5{
public static void main (String [] args){
  
  double a;
  double b;
  double x;
 
  System.out.println("Este programa resuleve ecuaciones de primer grado, por favor introduzca los siguientes valores:\n");
  System.out.println("Introduce el valor de a:");
  a= Double.parseDouble(System.console().readLine());
  
  System.out.println("introduce el valor de b:");
  b = Double.parseDouble(System.console().readLine());

   x= (-b/a);
  System.out.printf("El resultado es: %.2f\n",x);
  
}
}
