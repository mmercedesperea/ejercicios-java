public class ejercicio12{
  public static void main (String [] args){
    
    int puntuacion=0;
    String respuesta;
    
    System.out.print("vamos a realizar un cuestionario de 10 preguntas sobre las asignaturas de este curso\n");
    
    System.out.print("Primera pregunta\nSwitch es una sentencia de:\n     a) Java  b) 3dMax c) steam ");
    respuesta =System.console().readLine();
    if (respuesta.equals("a")) {
      puntuacion += 1;
    } 
    
    System.out.print("Segunda pregunta\nUn lenguaje de bajo nivel es:\n     a) Un lenguaje mal hablado  b) Lenguaje mas proximo al de una maquina c) Ninguna de las dos ");
    respuesta =System.console().readLine();
    if (respuesta.equals("b")) {
      puntuacion += 1;
    } 
    
    System.out.print("Tercera pregunta\n¿Que es un registro en Base de Datos?:\n     a) Un cuadrado de una tabla  b) Una fila de una tabla c) Una forma de escribir ");
    respuesta =System.console().readLine();
    if (respuesta.equals("b")) {
      puntuacion += 1;
    }
    
    System.out.print("Cuarta pregunta\n¿Que numero en decimal es el binario 0010?:\n     a) 3  b) 10 c) 2 ");
    respuesta =System.console().readLine();
    if (respuesta.equals("c")) {
      puntuacion += 1;
    }
    
    System.out.print("Quinta pregunta\n¿que asignatura es FOL?:\n     a) Filosofia  b) Formacion y Orientacion Laboral c) Formacio y Ocio ");
    respuesta =System.console().readLine();
    if (respuesta.equals("b")) {
      puntuacion += 1;
    }
    
    System.out.print("sexta pregunta\n¿ En binario que resultado tiene 1+0?:\n     a) 0  b) 2 c) 1 ");
    respuesta =System.console().readLine();
    if (respuesta.equals("c")) {
      puntuacion += 1;
    }
     
    System.out.print("Septima pregunta\n¿Que es una Entidad en Base de datos?:\n     a) una tabla  b) Una fila de una tabla c) ninguna de las dos ");
    respuesta =System.console().readLine();
    if (respuesta.equals("a")) {
      puntuacion += 1;
    }
    System.out.print("Octaba pregunta\n¿Que numero en decimal es el binario 1110?:\n     a) 34  b) 14 c) 62 ");
    respuesta =System.console().readLine();
    if (respuesta.equals("b")) {
      puntuacion += 1;
    }
    
    System.out.print("Novena pregunta\n¿Que es HTML?:\n     a) Lenguaje de programacion  b) Una marca de ropa c) Un programa para hacer cuentas ");
    respuesta =System.console().readLine();
    if (respuesta.equals("a")) {
      puntuacion += 1;
    }
    
    System.out.print("Decima pregunta\n¿Es mayor un ExaByte o un TeraByte?:\n     a) TeraByte  b) ExaByte ");
    respuesta =System.console().readLine();
    if (respuesta.equals("b")) {
      puntuacion += 1;
    }
  
  System.out.printf("El resultado de su cuestionario es %d",puntuacion);
  
  }
  }
  

