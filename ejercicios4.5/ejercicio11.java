public class ejercicio11{
  public static void main (String [] args){
    
    System.out.println("Cuanto falta para media noche");
    System.out.println("Introduce la hora sin minutos:"); 
     int hora= Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduce los minutos:");
     int minutos= Integer.parseInt(System.console().readLine());
     
      if ((hora <0) || (hora> 24)){
       System.out.println("La hora no es correcta");
     }
     else if ((minutos <0) || (minutos >60)){
       System.out.println("Los minutos no son correctos");
     } 
     else{
      int segundosTotales = (hora * 3600) + (minutos * 60);
      int segundosDia = (24 * 3600) - (segundosTotales);    
    System.out.printf("Estos son los segundos que faltan para media noche: %d ", segundosDia);
 } 
}
}
 
  
  
  
      

      



