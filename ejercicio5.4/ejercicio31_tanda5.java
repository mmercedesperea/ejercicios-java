/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
  programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
  mitad (división entera entre 2) de la altura más uno.*/
  
public class ejercicio31_tanda5{
  public static void main (String [] args){
    
    int altura=0;
    int anchura =0;
    
    System.out.print("Vamos a pintar la letra L, para ello introduce la altura que desea:\n ");
    altura= Integer.parseInt(System.console().readLine());
    
    for (int i=0; i <=(altura-2); i ++){       //mientras que i sea menos que la altura menos 2.
      System.out.print("*\n");                 //pinta un asterisco.
    } 
    
    for (int a=0; a<=altura/2; a++){
      System.out.print("* ");
      } 
  }
}
