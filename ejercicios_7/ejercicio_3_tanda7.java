/*Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa.*/



public class ejercicio_3_tanda7 {
  public static void main(String[] args) {
    
    int [] n= new int [10];                                                                          //definimos el array con 10 espacios
    
    
    System.out.print("Dame 10 numeros y te los ordenare en orden inverso a lo introducido:\n");
    
    for(int i=0;i<10;i++){
      n[i] = Integer.parseInt(System.console().readLine());                                         //vamos escribiendo en los arrays del 0 al 10
     
      }
      
    System.out.print("Los numeros inversos a los introducidos son : ");                      
      for(int a=9;a>=0;a--){                                                                        //vamos contando desde el array numero 10 al 0(orden inverso)
      System.out.print(n[a]+" ");                                                                   //lo vamos mostrando
     
      }
  }
}
