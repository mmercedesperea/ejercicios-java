
public class caballos_concretos {
	
	public static void main (String[] args) {
    
    //Instancias 
    
    caballo rocinante;                // al estar en la misma carpeta la clase caballo podemos trabajar con ella 
    caballo clavilenio;
    
    rocinante =new caballo("Rocinante","macho");           // le ponemos su nombre y el sexo que son los metodos que le hemos aplicado en el objeto caballo
    clavilenio =new caballo("Clavileño","macho");  
   
    rocinante.setEdad(3);
    rocinante.setPeso(350);
    rocinante.setRaza("Español");
   
   /* System.out.println(rocinante.nombre);
    System.out.println(rocinante.getNombre()); //para llamar al metodo getNombre 
    System.out.println(rocinante.getEdad()); //para llamar al metodo getEdad
    System.out.println(rocinante.getPeso()); //para llamar al metodo getPeso
    * */
    
    System.out.print(rocinante);
    
    System.out.println();
    
    System.out.print(clavilenio);
    
    System.out.println();
    
    System.out.println("hola caballito");
    rocinante.sonido();
    System.out.println();
    
    System.out.println("toma tarta");
    rocinante.come("tarta selva negra");
    System.out.println("toma pienso, a ver si esto te gusta");
    rocinante.come("pienso");
    System.out.println();
		
	}
}

