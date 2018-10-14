public class ejercicio2{
  public static void main (String [] args){
    
    System.out.println("¿Que hora quieres?");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6)&&(hora <= 12)){
     System.out.println ("Buenos dias");
    } else if ((hora >= 13)&&(hora <= 20)){ 
      System.out.println("Buenas tardes");
    } else if (((hora >= 21)&&(hora <= 24)) || ((hora >= 0)&&(hora <=5))){
      System.out.println("Buenas noches");
    } else if ((hora > 24) || (hora < 0)){
      System.out.println("Esta hora no es valida");
    }      

}        
}


