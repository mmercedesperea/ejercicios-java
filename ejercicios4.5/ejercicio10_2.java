public class ejercicio10_2{
public static void main (String [] args){
  
  int mes;
  int dia;
  
  System.out.println("Vamos a descubrir tu horoscopo");
  System.out.printf("Introduce el numero del mes ");
    mes = Integer.parseInt(System.console().readLine());
  System.out.printf("Introduce el dia ");
    dia = Integer.parseInt(System.console().readLine());
  
  switch(mes) {
    case 1: 
    if (dia <21) {
    System.out.print("su horoscopo es: Capricornio\n");
    } else {
     System.out.print("su horoscopo es: Acuario\n");
    }
      break;

    case 2:
    if (dia < 20){
     System.out.print("su horoscopo es: Acuario\n");
    } else {
      System.out.print("su horoscopo es: Piscis\n");
    }
      break;
    
    case 3:
    if (dia < 21){
      System.out.print("su horoscopo es: Piscis\n");
    } else{
      System.out.print("su horoscopo es: Aries\n");
    }
    break;
    
    case 4:
    if (dia <21){
      System.out.print("su horoscopo es: Aries\n");
    } else{
      System.out.print("su horoscopo es: Tauro\n");
    }
    break;
    
    case 5:
    if (dia <20){
      System.out.print("su horoscopo es: Tauro\n");
    } else{
      System.out.print("su horoscopo es: Geminis\n");
    }
    break;
    
    case 6:
    if (dia <22){
      System.out.print("su horoscopo es: Geminis\n");
    } else{
      System.out.print("su horoscopo es: Cancer\n");
    }
    break;
    
    case 7:
    if (dia <22){
      System.out.print("su horoscopo es: Cancer\n");
    } else{
      System.out.print("su horoscopo es: Leo\n");
    }
    break;
    
    case 8:
    if (dia <24){
      System.out.print("su horoscopo es: Leo\n");
    } else{
      System.out.print("su horoscopo es: virgo\n");
    }
    break;
    
    case 9:
    if (dia <23){
      System.out.print("su horoscopo es: virgo\n");
    } else{
      System.out.print("su horoscopo es: Libra\n");
    }
    break;
    
    case 10:
    if (dia <23){
      System.out.print("su horoscopo es: Libra\n");
    } else{
      System.out.print("su horoscopo es: Escorpio\n");
    }
    break;
     
    case 11:
    if (dia <23){
      System.out.print("su horoscopo es: Escorpio\n");
    } else{
      System.out.print("su horoscopo es: Sagitario\n");
    }
    break;
    
    case 12:
    if (dia <21){
      System.out.print("su horoscopo es: Sagitario\n");
      
    } else{
      System.out.print("su horoscopo es: Tauro\n");
    }
    break;

      default:
      System.out.print("Este no es un mes");
      }
      
  
}
}


