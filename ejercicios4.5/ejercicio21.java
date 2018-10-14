public class ejercicio21 {
    public static void main(String[] args) {

        System.out.println("Por favor introduce la nota de su primer examen ");
        double nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("Por favor introduce la nota de su segundo examen ");
        double nota2 = Double.parseDouble(System.console().readLine());
        
        double media = ((nota1 + nota2) / 2);

        if (media >= 5) {
            System.out.printf("Enhorabuena esta aprobado %.2f es su media.", media);
        }
        if (media < 5) {
            System.out.println("¿Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
            String recuperacion = System.console().readLine();
            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota de programacion es un 5. ");
            } else {
                System.out.printf("Tu nota de programacion es %.2f.", media);
            }
        }
    }
}
  
