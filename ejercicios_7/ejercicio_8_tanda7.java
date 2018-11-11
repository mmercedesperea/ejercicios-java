/*Ejercicio 8
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.*/


public class ejercicio_8_tanda7 {
  public static void main(String[] args) {
    
    int [] tem=new int [12];
    
    System.out.print("Ve diciendome la temperatura media que hizo el año pasado en cada mes :\n");
    
    for (int i=0; i<12;i++){
      
     tem[i]=Integer.parseInt(System.console().readLine());
    }
    
    for (int i=0; i<12;i++){                                       //ve pasando del 1 al 12
      for(int a=0; a<=tem[i]; a++){                                //ve pintando * hasta que se llegue al valor de temp[i] correspondiente.
      System.out.print("*");
    }
    System.out.println();
    }
  }
}
