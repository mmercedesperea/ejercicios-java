public class ejercicio8{
  public static void main (String [] args){
    
    int horaTraba;
    int hora;
    int salario;
    
    hora = 12;

    System.out.println("Introduzca sus horas trabajadas:");
    horaTraba= Integer.parseInt(System.console().readLine());
    
    salario= horaTraba * hora;
    
    System.out.printf("Su salario semanal es: %d \n",salario);

  }
}
