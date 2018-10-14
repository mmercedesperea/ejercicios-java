public class ejercicio15{
  public static void main (String [] args){
    
    System.out.println("¡Vamos a hacer una piramide!");
    System.out.println("Introduce el simbolo, caracter o numero a usar:");
     String c = System.console().readLine();
     
    System.out.println("Elige la posicion de su piramide del 1 al 4");
    System.out.println("1. Vertice hacia arriba");
    System.out.println("2. Vertice hacia abajo");
    System.out.println("3. Vertice hacia la derecha");
    System.out.println("4. Vertice hacia la izquierda");
      int opcion = Integer.parseInt(System.console().readLine());
      
    
    switch (opcion){
      
      case 1:
       System.out.println("     " + c);
       System.out.println("    "+ c + c + c);
       System.out.println("   "+c + c + c + c + c);
       System.out.println("  "+c + c + c + c + c + c + c);
       System.out.println(" "+c + c + c + c + c + c + c + c + c);
       System.out.println(""+c + c + c + c + c + c + c + c + c + c + c);
       
      break;
      
      case 2:
       System.out.println(""+c + c + c + c + c + c + c + c + c + c + c);
       System.out.println(" "+c + c + c + c + c + c + c + c + c);
       System.out.println("  "+c + c + c + c + c + c + c);
       System.out.println("   "+c + c + c + c + c);
       System.out.println("    "+ c + c + c);
       System.out.println("     " + c);
       
      break;
      
      case 3:
        System.out.println(""+c);
        System.out.println(""+c + c);
        System.out.println(""+c + c + c);
        System.out.println(""+c + c + c + c);
        System.out.println(""+c + c + c + c + c);
        System.out.println(""+c + c + c + c + c + c);
        System.out.println(""+c + c + c + c + c + c + c );
        System.out.println(""+c + c + c + c + c + c + c + c);
        System.out.println(""+c + c + c + c + c + c + c + c + c);
        System.out.println(""+c + c + c + c + c + c + c + c + c + c);
        System.out.println(""+c + c + c + c + c + c + c + c + c);
        System.out.println(""+c + c + c + c + c + c + c + c);
        System.out.println(""+c + c + c + c + c + c + c);
        System.out.println(""+c + c + c + c + c + c);
        System.out.println(""+c + c + c + c + c);
        System.out.println(""+c + c + c + c);
        System.out.println(""+c + c + c);
        System.out.println(""+c + c);
        System.out.println(""+c);
        
        break;
        
        case 4:
        System.out.println("                    "+c);
        System.out.println("                  "+c + c + c);
        System.out.println("                "+c + c + c + c + c);
        System.out.println("              "+c + c + c + c + c + c + c);
        System.out.println("            "+c + c + c + c + c + c + c + c + c);
        System.out.println("          "+c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("        "+c + c + c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("      "+c + c + c + c + c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("    "+c + c + c + c + c + c + c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("   "+c + c + c + c + c + c + c + c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("    "+c + c + c + c + c + c + c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("      "+c + c + c + c + c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("        "+c + c + c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("          "+c + c + c + c + c + c + c + c + c + c + c);
        System.out.println("            "+c + c + c + c + c + c + c + c + c);
        System.out.println("              "+c + c + c + c + c + c + c);
        System.out.println("                "+c + c + c + c + c);
        System.out.println("                  "+c + c + c);
        System.out.println("                    "+c);
      
        break;
 
      default:
      System.out.print(" \n Lo siento, la opcion elegida no es correcta.");
      
    
 } 
 } 
 } 


 
  
  
  
      

      



