public class ejercicio10{
public static void main (String [] args){
  
  int mes;
  int dia;
  
  String horoscopo = "";
  
  System.out.println("Vamos a descubrir tu horoscopo");
  System.out.printf("Introduce el numero del mes ");
    mes = Integer.parseInt(System.console().readLine());
  System.out.printf("Introduce el dia ");
    dia = Integer.parseInt(System.console().readLine());
  
  switch(mes) {
    case 1: 
    if (dia <21) {
    horoscopo="Capricornio";
    } else {
     horoscopo="acuario";
    }
      break;

    case 2:
    if (dia < 20){
     horoscopo="acuario";
    } else {
      horoscopo="piscis";
    }
      break;
    
    case 3:
    if (dia < 21){
      horoscopo="piscis";
    } else{
      horoscopo="Aries";
    }
    break;
    
    case 4:
    if (dia <21){
      horoscopo="Aries";
    } else{
      horoscopo="Tauro";
    }
    break;
    
    case 5:
    if (dia <20){
      horoscopo="Tauro";
    } else{
      horoscopo="Geminis";
    }
    break;
    
    case 6:
    if (dia <22){
      horoscopo="Geminis";
    } else{
      horoscopo="Cancer";
    }
    break;
    
    case 7:
    if (dia <22){
      horoscopo="Cancer";
    } else{
      horoscopo="Leo";
    }
    break;
    
    case 8:
    if (dia <24){
      horoscopo="Leo";
    } else{
      horoscopo="Virgo";
    }
    break;
    
    case 9:
    if (dia <23){
      horoscopo="Virgo";
    } else{
      horoscopo="Libra";
    }
    break;
    
    case 10:
    if (dia <23){
      horoscopo="Libra";
    } else{
      horoscopo="Escorpio";
    }
    break;
     
    case 11:
    if (dia <23){
      horoscopo="Escorpio";
    } else{
      horoscopo="Sagitario";
    }
    break;
    
    case 12:
    if (dia <21){
      horoscopo="sagitario";
    } else{
      horoscopo="Tauro";
    }
    break;

      default:
      }

      System.out.print("su horoscopo es: \n" + horoscopo);

}
}


