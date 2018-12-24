package matematicas;
public class Numero_curioso {

public static long curioso(long x) {
  
    long cuadrado=x*x;
    long numeroOriginal=x;
  
    //saca los digitos del numero original
  
   int numeroDigi=1;                                                         //numero de digito basico. 
    if (x<10){numeroDigi=1;}
    else{
       while (x> 10){                                                        // mientras el numero sea mayor que 10.
        x= x/10;                                                             // ve dividiendolo entre 10. 
        numeroDigi++;                                                        //por cada division añade un 1 al numero de digitos.
        }
      }
      
      
          //saca los digitos del cuadrado
  
   int numeroDigicuadrado=1;                                                         //numero de digito basico. 
    long cuadradigi=cuadrado;
    
       while (cuadradigi> 10){                                                       // mientras el numero sea mayor que 10.
        cuadradigi= cuadradigi/10;                                                   // ve dividiendolo entre 10. 
        numeroDigicuadrado++;                                                        //por cada division añade un 1 al numero de digitos.
        }
      
  
      
      //vuelta al numero
      long vuelta=0;
      long cuadradoV=cuadrado;
      
      while (cuadradoV>0){                                                              //mientras numero sea mayor que 0
        vuelta=(vuelta*10)+ (cuadradoV%10);                                             //primero el numero eje 234 en la primera vuelta vuelta sera 0*10 =0 + el resto de 234 /10 es = 4.
        cuadradoV= cuadradoV/10;                                                        //el numero 234 se divide entre 10 = 23. por lo tanto vuelve a dar la vuelta 
       
      }
      
      
     //recortamos las cifras
     int numeroDigiCua=numeroDigicuadrado;
     long recortado=vuelta;
     
     while(numeroDigiCua>numeroDigi){                                           //  mientras el numero de digitos del cuadrado sea mayor que el del original
       recortado=recortado/10;                                                  // el numero se ira dividiendo y perdiendo numeros de la unidad
       numeroDigiCua--;                                                         // se ira disminuyendo el contador de digitos del cuadrado
       }
       
       
       
        //vuelta al numero
      long vuelta2=0;
      long curioso=recortado;
      while (curioso>0){                                                         // mientras numero sea mayor que 0
        vuelta2=(vuelta2*10)+ (curioso%10);                                      // primero el numero eje 234 en la primera vuelta vuelta sera 0*10 =0 + el resto de 234 /10 es = 4.
        curioso= curioso/10;                                                     // el numero 234 se divide entre 10 = 23. por lo tanto vuelve a dar la vuelta 
       
      }
      
      
      return vuelta2;
      
      
      
  }
}
