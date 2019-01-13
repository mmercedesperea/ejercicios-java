/*
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número de derecha
  a izquierda una posición. El dígito de más a la izquierda, pasaría a dar la vuelta y se colocaría
  a la derecha. Si el número tiene un solo dígito, se queda igual.
 * 
 */


public class ejercicio_2_dam {
	
	public static void main (String[] args) {
 
    System.out.println("Deme un numero y lo desplazare a la izquiera una posicion");
    int numero =Integer.parseInt(System.console().readLine());
    
    int[] array = rotaIzquierdaArrayInt(numero);
    
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]);
    }
		
	}

 //saca digitos
  public static int digitos(int x) {
    if (x == 0) {
      return 1;
      } else {
        int n = 0;
        while (x > 0) {
        x = x / 10;
        n++;
        }
    return n;
    }
  }
  
  //pasamos el numero a un array
  public static int[] pasa_a_array(int x){
    int cifras=digitos(x);
    int [] arrayNum= new int [cifras]; 
    int aux2=x;
    int contador=0;
    
    while (aux2>0){
      arrayNum[contador]=aux2%10;
      aux2=aux2/10;
      contador++;
     }
     
    int [] array2= new int [cifras]; 
    int contadorIn=contador-1;
     
     //volteamos el array
     for (int i=0;i<arrayNum.length;i++){
       array2[i]=arrayNum[contadorIn];
       contadorIn--;
       }
    return array2;
    }
    
    //ahora lo vamos moviendo
      public static int [] rotaIzquierdaArrayInt(int num){
        int [] a = pasa_a_array(num);
        int aux;
          aux= a[0];
          for (int i=0; i<a.length-1;i++){
            a[i]=a[i+1];
            }
          a[a.length-1]=aux;
          
          return a;
      }
 
}

