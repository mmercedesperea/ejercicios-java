/*Ejercicio 22
Realiza un programa que pinte por pantalla una serpiente con un serpenteo
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.
Ejemplo:
Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
    @
    *
  *
    *
    *
      *   */
            
public class ejercicio_22_tanda6 {
  public static void main(String[] args) {
    
    System.out.print("Por favor introduzca la longitud que desea para su serpiente : \n");
    int longitud=Integer.parseInt(System.console().readLine());
      
    System.out.print("            @\n");
    
    int posi=12;
    
    for(int i=0;i<=longitud;i++){
      
      posi= posi + (int)(Math.random()*3)-1;
      
      for(int p=1;p<=posi;p++){
        System.out.print(" ");
        }
        System.out.print("*\n");
    }
  }
}

