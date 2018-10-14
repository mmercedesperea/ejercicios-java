public class ejercicio24{
  public static void main (String [] args){

    int cargo;
    int viaje;
    int EstadoCivi;
    int sueBase = 0;
    double diet;
    double sueldobruto;
    double sueldoneto =0;
    int IRPF =0;
    double retencion;

    System.out.printf("introduce su cargo 1-Prog. junior, 2 -Prog. senior, 3-Jefe de proyecto   ");
    cargo = Integer.parseInt(System.console().readLine());

    System.out.printf("Introduce los dias que ha estado de viaje por trabajo                    ");
    viaje= Integer.parseInt(System.console().readLine());

    System.out.printf("Estado civil  1-casado  2-soltero                                        ");
    EstadoCivi = Integer.parseInt(System.console().readLine());

    switch(cargo) {
    case 1:
    sueBase= 950;
    break;
    case 2:
    sueBase=1200;
    break;
    case 3:
    sueBase=1600;
    break;
    default:
    System.out.println("no ha elegido su cargo correctamente");
    }

    diet=(viaje * 30);

    sueldobruto=(sueBase + diet);

    if (EstadoCivi==1){
    IRPF= 20;
    }
    else if (EstadoCivi==2){
    IRPF=25;
    }
    else{
    System.out.println("no ha elegido correctamente su estado civil");
    }

    retencion= ((sueldobruto * IRPF )/100);
    sueldoneto = (sueldobruto - retencion);

System.out.printf("su sueldo base es        : %d\n",sueBase);
System.out.printf("las dietas son %d viajes  : %.3f\n",viaje, diet);
System.out.printf("Su sueldo bruto es       : %.3f\n",sueldobruto);
System.out.printf("Su retencion es          : %.3f\n",retencion);
System.out.printf("su sueldo neto es        : %.3f\n",sueldoneto);

}
}

