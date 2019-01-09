/*
 *2. [3 puntos] Elija una de las opciones:
OPCIÓN A: Implemente un comprobador de números de un sorteo de la lotería. En este sorteo, se van a dar
los siguientes premios:
Primer premio: 1 número 1000 €
Segundo premio: 1 número 500 €
Tercer premio: 1 número 250 €
Pedreas: 10 números 50 €
Reintegros: Números que
acaben o empiecen con la
última cifra-dígito del primer
premio:
5 €
Los números que juegan oscilan entre el 1 y el 9999. El programa obtendrá aleatoriamente los números
premiados (los cuales no podrán repetirse). A continuación, pedirá reiteradamente al usuario que introduzca
números, informando para cada uno de ellos si tiene premio y su cuantía. El programa finalizará cuando se
introduzca el número 0 cero, mostrando entonces por pantalla la tabla completa con los números
premiados (también se informará de la cifra-dígito de reintegros). Los premios no son acumulativos; sólo se
cobra el premio de mayor cuantía. Y el reintegro se cobra sólo una vez.
* 
→ Debe implementar, al menos, las siguientes funciones: (a) una función que genere los números
premiados sin que se repitan, (b) otra que sirva para comprobar el premio (cuantía) que recibe un número
que se le pase como argumento, y (c) otra función que presente por pantalla la lista de los números
premiados, además de la última cifra-dígito del primer premio (correspondiente a los reintegros). Debe
decidir los argumentos y los valores que, en su caso, cada función necesite.
 * 
 * 
 */


public class ejercicio_examen_2_A {
	
	public static void main (String[] args) {

    int [] array= numeros_loteria();
    int numero;
   
  do{
   System.out.println("Deme un numero para saber si le ha tocado premio o no");
   numero=Integer.parseInt(System.console().readLine());
   
   if (numero!=0){
     System.out.print(numeros_premiados(numero,array));
   }
  }while (numero!=0);
  
  numeros_loteria_lista(array);
    
	}
  //---------------------FUNCIONES----------------------
  
      //una función que genere los números premiados sin que se repitan
  public static int[] numeros_loteria (){ 
   
    int [] array= new int [13];
    int aleatorio=0;
    
    for (int i = 0; i < 13; i++) {
      aleatorio = (int) (Math.random ()*10000)+1;//Generamos aleatorio
      for (int j = 0; j < i; j++) { 
          /*buscamos que no este repetido, si esta repetido genero otro aleatorio y empiezo de 0 previniendo el j++ */
          if(array[j] == aleatorio){ 
              aleatorio =(int) (Math.random ()*10000)+1;
              j=-1;
          }
      }
      array[i] = aleatorio;    //No esta repetido, luego guardamos el aleatorio
    }
    return array;
  }
  
  // comprobar el premio (cuantía) que recibe un númeroque se le pase como argumento
  
  public static String numeros_premiados (int x,int r[]){ 
    
    String premio="";
    int [] array= r;
    
    int n=x;
    int vuelta=0;
    
    boolean esta=false;
    
    //para dar la vuelta
     while (n>0){                  
        vuelta=(vuelta*10)+ (n%10);  
        n= n/10;                     
      }
    //-------------
    for(int i=0;i<13;i++){
      if (x==array[i]){
        esta=true;}
      }
    
    if (esta==true){
      if (x==array[0]){
        premio="Su premio son 1000 euros";
      } else if  (x==array[1]){
          premio="Su premio son 500 euros";
        } else if (x==array[2]){
          premio="Su premio son 250 euros";
          } else {
              premio="Su premio son 50 euros";
            } 
     }
     if(esta==false){
       if ((x%10 == array[0]%10) || (vuelta%10 == array[0]%10) && (x !=array[0])) {
         premio="Su premio son 5 euros";
         }else {premio="No tiene premio";} 
    }
    
    return premio;
  }
  
  /*(c) otra función que presente por pantalla la lista de los números
premiados, además de la última cifra-dígito del primer premio (correspondiente a los reintegros).
 */
  public static void numeros_loteria_lista (int [] x){ 
    
     int [] array= x;
     
     System.out.println( "Los premios son \n");
     
     for ( int i=0;i<array.length;i++){ 
    System.out.print(i+1 + "º Premio " + array[i] + "\n");
  }
  System.out.println();
   System.out.print("El reintegro es : " + array[0]%10);
    
  } 
}

