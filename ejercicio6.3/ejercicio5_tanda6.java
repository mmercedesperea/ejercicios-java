/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.*/

public class ejercicio5_tanda6 {
  public static void main(String[] args) {
    
    int numero=0;
    
    int contador=0;
    int suma=0;
    
    int mini=199;
    int maxi=0;
    
    for(int i=1; i<=50;i++){
      
      numero=(int)(Math.random()*100)+100;
      System.out.print(numero + " ");
      suma= suma + numero;
      
      if (numero<mini){
        mini=numero;
        }
      if ( numero>maxi){
        maxi=numero;
        }  
      contador++;
    }
    
    int media= suma/contador;
    
    
    System.out.println();
    System.out.println("El numero maximo es : "+ maxi);
    System.out.println("El numero minimo es : "+ mini);
    //System.out.println("La suma es  : "+suma);
    System.out.println("La media es : "+ media);
  }
}  
