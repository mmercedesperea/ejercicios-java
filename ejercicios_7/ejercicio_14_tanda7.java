/*Ejercicio 14
Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.*/

public class ejercicio_14_tanda7 {
  public static void main(String[] args) {
    
    String [] color= { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro",
                      "blanco" , "morado"};                  //Se asignan los colores a los que va a paertenecer cada pasada del array,
    
    String [] palabra= new String [8];                //array de caracteres
    String [] resultado= new String [8];              //array de caracteres
    String [] nocolor= new String [8];              //array de caracteres
    
    int r=0;
    
    System.out.print("Dame 8 palabras \n");
    
        // se van pidiendo las palabras
    for (int i=0; i<8;i++){                            //se van a pedir 8 palabras
      palabra[i]= System.console().readLine();           //se van almacenando los array de caracteres
        
        // Se comprueba que la palabra es color o no 
      for (String c : color) {                           //la string c recorre todo el array color
        if (palabra[i].equals(c)) {                      //Si la palabra intrucida es igual a algun color
        resultado[r++] = c;                              //el resultado almacena color y pasa al siguiente valor de resultado.
        } 
      }
    }
       // se van a asignar las otras palabras a resultado
    for (int i=0; i<8; i++){                                // para ir añadiendo los que no sean color a la continuacion del array resultado.
      boolean pc=false;                          // se reinicia en falso la palabra color 
      
            // se comprueba si es un color o no
        for (String c:color){                              // se va comprobando que todos los colores
          if (palabra[i].equals(c)){                       // si la palabra de esta ronda es igual a cualquiera de los colores  
            pc=true;                              // si la palabra es un color palabra color es true
          }                             
        }
             // si la pabara no es un color , pasa a su posicion indicada
          if (pc==false){                           // si palabra es false( lo que indica que la palabra de esta ronda no es un color)
            resultado[r++]=palabra[i];                      // si no es un color pasa a la posicion continua de resultado 
          }  
    }
    System.out.print("Array original\n");
     for (int i=0; i<8;i++){
    System.out.print(palabra[i]+ " ");
    }
    System.out.println();
    System.out.print("Array ordenado\n");
    for (int i=0; i<8;i++){
    System.out.print(resultado[i]+ " ");
    }
  
  }
}
