public class ejercicio4{
  public static void main (String [] args){
    
    int salario;
    int horaTraba;
    
    System.out.println("por favor, introduzca el numero de horas trabajadas durante la semana:");
    horaTraba= Integer.parseInt(System.console().readLine());
    
    if (horaTraba <= 40){
       salario= horaTraba * 12;
  } else{   
       salario= (40 *12) + ((horaTraba - 40) * 16);
  }
    System.out.printf("Salario semanal es: %d euros", salario);
    
    
  }
}
  
  
  
  
      

      



