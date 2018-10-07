public class Ejercicio5{
  public static void main (String[] args){
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String celeste = "\033[36m";
    
    System.out.println(morado + "Lunes\tMartes\tMierc.\tJueves\tViernes");
    System.out.println(blanco + "------\t------\t------\t------\t-------");
    System.out.println(rojo + "SINF"+ verde + "\tPROG"+ naranja + "\tEED\tEED"+ rojo + "\tSINF");
    System.out.println(rojo + "SINF"+ verde + "\tPROG"+ azul + "\tLM"+ verde + "\tPROG"+ rojo + "\tSINF");
    System.out.println(rojo + "SINF"+ verde+ "\tPROG"+ naranja + "\tEED\tEED"+ rojo + "\tSINF");
    System.out.println(blanco + "FOL"+ celeste + "\tBBDD"+ verde + "\tPROG"+ celeste + "\tBBDD"+ naranja + "\tEED");
    System.out.println(blanco + "FOL"+ celeste + "\tBBDD"+ verde + "\tPROG"+ celeste + "\tBBDD"+ azul + "\tLM");
    System.out.println(blanco + "FOL"+ celeste + "\tBBDD"+ verde + "\tPROG"+ celeste + "\tBBDD"+ azul + "\tLM");
    
    
  }
  
}
