/*Ejercicio 7
Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados.*/


public class ejercicio_7_tanda7 {
  public static void main(String[] args) {
    
    int valor1=0;
    int valor2=0;
    
    int [] numeroAl= new int [100];
    for (int i=0;i<100;i++){
    numeroAl[i]=(int)(Math.random()*21);  //cargamos el array con numero del 0 al 20
    System.out.print(numeroAl[i]+ " ");   //Lo mostramos
    }
    
    System.out.print("\nDame un valor de los mostrados anteriormente: \n");
    valor1=Integer.parseInt(System.console().readLine());                         //pedimos un valor
    
    System.out.print("Dame un valor que le quieras asignar: \n");
    valor2=Integer.parseInt(System.console().readLine());                       //pedimos otro valor
    
    for (int i=0;i<100;i++){                                                     //Vamos pasando el array
      if (numeroAl[i]==valor1){                                                  //Si el array tiene el valor de numero uno
        numeroAl[i]=valor2;                                                      //Entonces el array toma el valor del numero segundo que pusimos
        System.out.print("*"+ numeroAl[i] + "* " );                              //Mostramos el array cambiado
      }else{System.out.print(numeroAl[i] + " ");
       } 
    }
  }
}
