public class ejercicio20{
  public static void main (String [] args){
    
    /*Realiza un programa que diga si un número entero positivo introducido por
      teclado es capicúa. Se permiten números de hasta 5 cifras..*/
    
    int cifra;
    boolean capicua=false;
     
    System.out.print("Vamos a decirte si tu numero entero positivo introducido por teclado es capicua:\n");
    cifra= Integer.parseInt(System.console().readLine());

    if (cifra< 10){
      capicua =true;
        } else if ((cifra >= 10)&& (cifra<100)){
       if ((cifra/10) ==(cifra %10)){
         capicua=true;
       }      
    } else if ((cifra>=100) && (cifra<1000)){
        if ((cifra/100 )== (cifra %10)){
          capicua=true;
          }
    } else if ((cifra>=1000) && (cifra<10000)){
        if (((cifra/1000)==(cifra%10))&&(((10)==((cifra/10)%10)))) {
          capicua=true;
        }
    } else if ((cifra>=10000) && (cifra<100000)){
        if (((cifra/10000)==(cifra%10)) &&((((cifra/1000)%10))==((cifra/10)%10))){
          capicua=true;
        }
    }  
    if (cifra>100000){
      System.out.println("El numero tiene mas de las cifras permitidas");
    } 
    
    if (capicua==true){
      System.out.println("El numero introducido es capicua");
      }else {
      System.out.println("El numero introducido no es capicua.");
    }  
  }
}

