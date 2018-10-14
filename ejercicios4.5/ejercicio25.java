public class ejercicio25 {
    public static void main(String[] args) {

        System.out.print("Introduce la altura de la bandera en cm: ");
        int altura = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce la anchura: ");
        int anchura = Integer.parseInt(System.console().readLine());

        System.out.print("¿Quiere el escudo bordado? (s/n)");
        String bordado = System.console().readLine();

        System.out.print("Gracias. aqui tiene el desglose de su compra.\n");

        double precioBase = 0.01;
        int bandera = (anchura * altura);
        double precioBandera = (bandera * precioBase);
        double precioTotal = precioBandera + 3.25;

        if (bordado.equals("s")) {
            precioTotal = precioTotal + 2.50;
        }

        System.out.printf("Precio base de su bandera  de  %d cm2:           %.2f euros\n", bandera, precioBandera);
        if (bordado.equals("s")) {
            System.out.printf("Con escudo                                        2,50 euros\n");
        } else {
            System.out.printf("Sin escudo                                        0,00 euros\n");
        }

        System.out.printf("Gastos de envio:                                  3,25 euros\n");
        System.out.printf("El precio total:                                  %.2f euros\n", precioTotal);

    }
}
