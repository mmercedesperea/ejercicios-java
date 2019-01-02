/*
 *Funciones para arrays de una dimension
 * 
 */

package funciones;
public class funciones_array {
	
     //generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];    // se genera un array de tamaño n
     
    for (int i = 0; i < n; i++) {
      x[i]=(int)(Math.random()*(maximo-minimo+1)+minimo);   // se rellena el array con numeros aleatorios que van entre el maximo fijado y el minimo
      }
      return x;
    }
    
    
      //2. minimoArrayInt: Devuelve el minimo del array que se pasa como parámetro.
  public static int minimoArrayInt(int[] x) {     // para pasar un array como parametro
    int maximo =0;
    
    for (int i=0; i<x.length;i++){
      if (x[i]>maximo){
        maximo=x[i];
        }
      }
      int minimo=maximo;
    for (int i=0; i<x.length;i++){
      if (x[i]<minimo){
        minimo=x[i];
        }
      }
    return minimo;
    }
    
    //3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
  public static int maximoArrayInt(int[] x) {     // para pasar un array como parametro
    int maximo =0;
    for (int i=0; i<x.length;i++){
      if (x[i]>maximo){
        maximo=x[i];
        }
      }
    return maximo;
    }
    
   //4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
   public static int mediaArrayInt(int[] x) { 
     int media=0;
     int suma=0;
     for (int i=0; i<x.length;i++){
      suma=suma+x[i];
      }
      media=suma/x.length;
    return media;
   }
   
   //5. estaEnArrayInt: Dice si un número está o no dentro de un array.
   public static boolean estaEnArrayInt(int[] x, int n) {
     boolean esta=false;
    for (int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        esta= true;
      }
    }
    return esta;
  }
  
  //6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
   public static int posicionEnArrayInt(int[] x, int n) {
     int posicion=0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        posicion=i+1;
      }
    }
    return posicion;
  }
  
  //7. volteaArrayInt: Le da la vuelta a un array.
  
  public static int[] volteaArrayInt(int[] x) {
     int[] volteado = new int[x.length]; 
      
      for (int i=0;i<x.length;i++){
        volteado[x.length-i-1]=x[i];
        }
        return volteado;
  }
  
  //8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
  
      public static int[] rotaDerechaArrayInt(int[] x, int n) {
        
        int[] a = x.clone(); // clona en a el contenido de x
        int aux;
        while (n > 0) {     //mientras que el n sea mayor que 0
          n--;              // ve restando valores a n
          aux = a[a.length - 1];   // el auxiliar tendra el valor maximo del array se usa el menos 1 por que realmente el array de 20 tiene posicion hasta el 19 ( del 0 al 19) osea 20 posiciones
          for(int i = a.length - 1; i > 0; i--) {  // i tiene el valor maximo del array y se ira descontando de arriba a abajo
              a[i] = a[i - 1];                   // el array a ( en la maxima posicion ira cogiendo valores del array a menos 1 posicion ( ejemplo en la posicion 19 se pondra el valor de la posicion 20 , en el 18 el del 19) y asi cada ronda se iran cambiando posiciones hasta que el while n llegue a 0
            }
          a[0] = aux;                           // el array a en la posicion 0 ira pillando en cada ronda el valor que va quedando sin sitio  como seria en el ejemplo anterior el valor que venga de la posicion 20 
        }
          return a;
        }
        
        
  //9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
  
      public static int [] rotaIzquierdaArrayInt(int[] x, int n){
        int [] a = x.clone();
        int aux;
        while(n>0){
          n--;
          aux= a[0];
          for (int i=0; i<a.length-1;i++){
            a[i]=a[i+1];
            }
          a[a.length-1]=aux;
          }
          return a;
        
        }
        
        //_--------------------------------------------------------------------------FILTRA PRIMOS
    //sacar primos
    
    public static int[] filtraPrimos(int x[]) {
    int [] primosaux =new int[x.length]; 
    int contador=0;
  
    for (int i=0; i <x.length; i ++) { 
      boolean primo =true;
        for (int n=2; n <x[i]&& primo==true; n ++) {
          if ((x[i] % n)==0){  //Esto hace que se compruebe que el numero dividido entre i el resto es 0 primo sera false.
          primo=false;
          }
        }
        if((primo==true)&&(x[i]!=1)){
          primosaux[contador] =x[i];
          contador ++;
          } 
      }
      
        if (contador>0){
          int [] primos =new int[contador];
          for(int p=0;p<contador;p++){
        primos[p]=primosaux[p];
        }
      return primos;
        }else{
          int [] primos =new int[1];
        primos[0]=-1;
      return primos;
      }
       
    }
    //_---------------------------------------------------------------------------//FILTRA CAPICUAS
    //devuelve capicuas
    
    public static int[] filtraCapicuas(int x[]){
      
      int [] capiaux =new int[x.length]; 
      int contador=0;
      int numeroIndividual=0;
      int volteado=0;
      
      for(int i=0;i<x.length;i++){
        numeroIndividual=x[i];
        volteado=voltea(numeroIndividual);
        if (numeroIndividual==volteado){
          capiaux[contador]=numeroIndividual;
          contador++;
          }
        }
        
        if (contador>0){
          int [] capicuos =new int[contador]; 
          for(int i=0;i<contador;i++){
         capicuos[i]=capiaux[i];
         }
      return capicuos;
        }else{
          int [] capicuos =new int[1]; 
        capicuos[0]=-1;
      return capicuos;
      }
    }
      //----------------------------------------------------------------------------------VUELTA A UN NUMERO

     //da la vuelta a un numero
    public static int voltea(int x) {
      if (x < 0) {
        return -voltea(-x);
        }
      int volteado = 0;
      while(x > 0) {
          volteado = (volteado * 10) + (x % 10);
          x = x / 10;
        }
      return volteado;
    }
 
 //---------------------------------------------------------------------------------FILTRA 7
    //Filtra numeros 7  
    public static int[] filtraCon7(int x[]) {
      int numeroIndividual=0;
      int [] arrayaux =new int[x.length]; 
      int contador=0;
      boolean siete=true;
      
      //filtramos los numeros para sacar los que contengan 7 
      for(int i=0;i<x.length;i++){
        siete=true;
        numeroIndividual=x[i];
        int numeroaux=numeroIndividual;
        int numeroredu=numeroIndividual;
        while(numeroredu>0){
          numeroaux=numeroredu%10;
          numeroredu=numeroredu/10;
            if ((numeroaux==7)&&(siete==true)){
              arrayaux[contador]=x[i];
              contador++;
              siete=false;
              }
        }
      }
      if (contador>0){
      int [] array7 =new int[contador];
      for(int i=0;i<contador;i++){
        array7[i]=arrayaux[i];
        }
      return array7;
        }else{int [] array7 =new int[1];
        array7[0]=-1;
      return array7;
      }
       
    }
     
}
