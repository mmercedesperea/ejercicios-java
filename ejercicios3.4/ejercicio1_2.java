import java.util.Scanner;
public class ejercicio1_2{
	public static void main(String[] args) {

		Scanner numero= new Scanner(System.in);

		System.out.print("Introduce el pimer numero:\n");
		int numero1=Integer.parseInt(numero.nextLine());

		System.out.print("Introduce el segundo numero:\n");
		int numero2=Integer.parseInt(numero.nextLine());

		int multiplicacion= numero1 * numero2;

		System.out.printf("la multiplicacion de %d y %d es : %d \n",numero1,numero2,multiplicacion);

		
	}


}
