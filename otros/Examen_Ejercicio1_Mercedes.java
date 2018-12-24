public class Examen_Ejercicio1_Mercedes {
  public static void main(String[] args) {
    
    
     /* Mercedes Perea 
     * 
     * 16 de diciembre del 2018
     * 
     * Programa con el que jugar al ahorcado
     * 
     * 
     */
    
      int intentos=0;
      String letra="";                 
      char[] letraChar = new char[0];                            //creamos un array que nos permitira almacenar las letras que vamos introduciendo
      String [] palabras= { "PERRO", "ROJO", "GATO", "MONO", "LUZ", "SOL", "NEGRO","BLANCO" , "VERDE", "PROGRAMACION"};
      int ganar=0;                                               //contador de puntos para la victoria ,de aciertos
      char letrasalida=' ';                                      //char para salir del programa
      boolean victoria=false;                                    //se usara para saber si se ha ganado o no
      boolean acierto=false;                                     //Se usara para saber si se ha acertado una palabra o no
      
      int elegir = (int)(Math.random()*10);                      //se elige una palabra aleatoria
      String PalElegida=palabras[elegir];                        //se guarda la palabra elegida al azar
      //System.out.print(PalElegida+ "\n");                      //para mostrar la palagra elegida
          
      char[]caracteres=PalElegida.toCharArray();                 //pasamos la palabra seleccionada a un array de caracteres para ello usamos toCharArray     
      char[] palVacia = new char[caracteres.length];             //se crea un char vacio con la longitud de nuestro char principal  
      
      System.out.print("Vamos a jugar al ahorcado la palabra seleccionada tiene los siguientes huecos, puede fallar 5 veces\nPara salir introduzca 0 \n");
          //se carga el array vacio con caracteres en _  
      for (int x=0;x<caracteres.length;x++){
          palVacia[x] = '_';
          System.out.print(palVacia[x]+" ");
        }
        System.out.println();
            do{
                System.out.print("Dame letras para ver si se encuentran en la palabra secreta\n");
                letra=System.console().readLine();                //Se van pidiendo letras como string
                letra=letra.toUpperCase();                        //combierte la letra que se ha introducido en mayuscula
                letraChar=letra.toCharArray();                    //pasamos el string introducido a un char 
                letrasalida=letraChar[0];                         //Letra salida convierte el char de array en un char normal, solo lo uso para salir del programa
                
                acierto=false;                                    // acierto se reiniciara todo el rato con false 
                
                for(int i=0;i<caracteres.length;i++){                // empezamos de 0 hasta llegar a la longitud de nuestro char principal
                  if (caracteres[i]==letraChar[0]){                  // Si alguna de las letras de nuestro array principal coincide con la letra introducida por el usuario
                    palVacia[i] =caracteres[i];                      // nuestro array vacio se cargara con la letra que ha coincidido con la metida por el usuario
                    acierto=true;                                    // y acierto sera true
                    }
                }
                
                if(acierto==false){intentos++;}                  // si acierto es falso , lo que quiere decir que no se ha metido ninguna letra que coincida con nuesta palabra secreta , se contara como un intento fallido      
                   
                for (int x=0;x<caracteres.length;x++){            //se muestra el array de los caracteres con los huecos que se han ido llenando.
                      System.out.print(palVacia[x]+" ");
                }
            
                System.out.println();
                
                for(int i=0;i<caracteres.length;i++){               
                  if (caracteres[i]==palVacia[i]){                 //Si alguna letra del array que se va llenando coincide con las de la palabra almacenada
                    ganar++;                                       //ganar aumentara su tamaño
                    }
                }
                
                if (ganar==caracteres.length){                    //si el contador de ganar es igual a la longitud de caracteres victoria sera true
                  victoria=true;}
                  
                ganar=0;                                     //se reinicia ganar
                  
              }while ((intentos<=5)&&(victoria==false)&&(letrasalida!='0')); 
                System.out.println();
                
                if (letrasalida=='0'){System.out.print("Ha salido del juego");}
                if (intentos>=5){System.out.print("Ha llegado al numero maximo de intentos, ha perdido");}
                if (victoria==true){System.out.print("Ha ganado");}
                    
  }
}
     
   
  
  
  
  
