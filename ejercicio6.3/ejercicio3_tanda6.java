/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
* oros, copas, espadas y bastos,*/

public class ejercicio3_tanda6 {
  public static void main(String[] args) {
    
    String palo = "";
    String valor= "";
    
    System.out.print("Vamos a sacarte una carta de la baraja Española al azar :\n");
    System.out.println();
     
    int nombre= (int)(Math.random()*4)+1;
    
      switch (nombre){
        
        case 1:
        palo="Oros";
        break;
        
        case 2:
        palo="Copas";
        break;
        
        case 3:
        palo="Espadas";
        break;
        
        case 4:
        palo="Bastos";
        break;
        }
        
    int numero= (int)(Math.random()*10)+1;
    
      switch (numero){
        
        case 1:
        valor="As";
        break;
        
        case 8:
        valor="Sota";
        break;
        
        case 9:
        valor="Caballo";
        break;
        
        case 10:
        valor="Rey";
        break;
        
        default:
        
        valor=String.valueOf(numero); 
        }

    System.out.println("La carta que ha salido es el " +valor + " de " + palo + ".");

  }
} 
