/*Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.*/


public class ejercicio46_tanda5 {
  public static void main(String[] args) {
    
    System.out.print("Vamos a pintar un rectangulo, deme la anchura (como minimo2): \n");
    int anchura= Integer.parseInt(System.console().readLine());
    
    System.out.print("Deme la altura (como minimo 2): \n");
    int altura= Integer.parseInt(System.console().readLine());
    
    if ((anchura>=2) && (altura>=2)){
      for(int i=0; i <anchura; i++){
        System.out.print("*");
        System.out.print(" ");
      }
      System.out.println();
      for(int a=1 ;a<altura/2; a++){
        for(int i=0;i<altura/2;i++){
          System.out.print("*");
          for(int b=1;b<anchura-1;b++){
            System.out.print("  ");
          }
            System.out.print(" *");
            System.out.println();
        } 
      }
      for(int i=0; i <anchura; i++){
        System.out.print("*");
        System.out.print(" ");
      }
    }else{
      System.out.print("Lo siento, los datos introducidos no son correctos, el valor minimo es 2");
     }
  }
}
