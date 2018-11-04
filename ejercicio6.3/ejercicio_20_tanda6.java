/*Ejercicio 20
Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.*/

public class ejercicio_20_tanda6 {
  public static void main(String[] args) {
        
    int ancho=0;
    int capacidad=0;
    
    System.out.print("Vamos a llenar una cuba, para ello dame la capacidad que quieres que tenga la cuba : ");
     capacidad= Integer.parseInt(System.console().readLine());
     
     int maxiagua=capacidad+1;
     
     int agua=(int)(Math.random()*maxiagua);
     System.out.print("La cuba tiene " +agua+ " litros de agua\n");
     System.out.println();
      
           //hacemos la cuba
     for(int i=1; i<(capacidad+1)-agua;i++){
       System.out.print("*     *");
       System.out.println();
       }
          //cantidad de agua
      for (int a=1; a<=agua; a++){
        System.out.print("*=====*");
        System.out.println();
      }    
      System.out.print("* * * *"); 
  }
}

