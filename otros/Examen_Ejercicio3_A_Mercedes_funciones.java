
import matematicas.perfecto;
public class Examen_Ejercicio3_A_Mercedes_funciones {
  public static void main(String[] args) {


//numero perfectos
     
    long numeroOri=0;
    System.out.print("Deme un numero y le dire cuantos numeros perfectos hay ente el 2 y su numero: \n");
    numeroOri= Integer.parseInt(System.console().readLine());
    
    for (int i=1;i<=numeroOri;i++){
      if ((matematicas.perfecto.perfecto(i))>0){
        System.out.print(i+ " ");
      }
    }
 }
}
