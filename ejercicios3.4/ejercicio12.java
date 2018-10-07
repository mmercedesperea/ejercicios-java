  public class ejercicio12{
    public static void main(String[] args) {

      System.out.print("Vamos a ver que nota media debe de sacar en Programacion en el segundo examen para obtener la nota deseada.\n");

      System.out.print("Introduce su nota del primer examen:\n");
      double nota1=Double.parseDouble(System.console().readLine());
      
      System.out.print("¿Que nota quiere sacar en el trimestre?");
      double notaDeseada= Double.parseDouble(System.console().readLine());
      
      double nota2= ((notaDeseada * 100)- (nota1 * 40)) /60;
      
      if (nota2>10){
        System.out.printf("La nota que le haria falta para obtener %.2f en el examen no es posible ya que es mayor que 10.\n",notaDeseada);
      } else{
        System.out.printf("Para tener un %.2f deberia de sacar un %.2f en el segundo examen. \n",notaDeseada,nota2);
        }

  }
}
