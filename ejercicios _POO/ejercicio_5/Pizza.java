/*
 * Ejercicio 5
Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es pedida.
El siguiente código del programa principal debe dar la salida que se muestra:
* 
public class PedidosPizza {
public static void main(String[] args) {
Pizza p1 = new Pizza("margarita", "mediana");
Pizza p2 = new Pizza("funghi", "familiar");
p2.sirve();
Pizza p3 = new Pizza("cuatro quesos", "mediana");
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
p2.sirve();
System.out.println("pedidas: " + Pizza.getTotalPedidas());
System.out.println("servidas: " + Pizza.getTotalServidas());
}
}
* 
pizza margarita mediana, pedida
pizza funghi familiar, servida
pizza cuatro quesos mediana, pedida
esa pizza ya se ha servido
pedidas: 3
servidas: 1
 * 
 * 
 */


public class Pizza {

 //atributos de clase, solo existira una variable para todas las clases que se ira acumulando 
  private static int TotalPedidas=0;                //empieza en 0 
  private static int TotalServidas=0;
  
  // atributos de instancias
    private String tamano;
    private String tipo;
    private String estado;
    
    
    public Pizza (String tamano, String tipo) {   // AL crear una pizza tendremos que poner su tamaño y su tipo
      this.tamano = tamano;
      this.tipo = tipo;
      this.estado = "Pedida";                     // El estado inicial de las pizzas sera pedida
      Pizza.TotalPedidas++;                       // cada vez que se cree un objeto pizza el contador de pizzas aumentara en uno
    }
    
    //Metodos
    
    public String toString () {    // PAra mostrar todos los atributos de pizza 
      String salida = "Pizza  " + this.tipo + " "+ this.tamano + " , " + this.estado;
      return salida;
    }
  
  
    public static int getTotalPedidas() {  //para mostrar todas las pizzas que se han pedido se usa el metodo get que permite devolver un valor 
      return Pizza.TotalPedidas;
    }

    public static int getTotalServidas() {  //para mostrar lel total de pizzas servidas
      return Pizza.TotalServidas;
    }
    
    
     public void sirve() {
      if (estado.equals("Pedida")) {
        System.out.println("Sirviendo Pizza");
        this.estado="Servida";
        Pizza.TotalServidas++;
      } else {
        System.out.println("Esa pizza ya se ha servido");
        }
    }
  
}

