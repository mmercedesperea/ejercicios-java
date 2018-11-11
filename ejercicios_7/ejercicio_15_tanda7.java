/*Ejercicio 15
Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). 
* 
* Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto,
si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
mensaje Lo siento, no admitimos grupos de 6, haga grupos de 4
personas como máximo e intente de nuevo.
* 
*  Para el grupo que llega,
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
grupo es de dos personas, se podrá colocar donde haya una o dos personas.
* 
* 
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
funcionamiento del programa se ilustra a continuación:*/


public class ejercicio_15_tanda7 {
  public static void main(String[] args) {
    
    int comensales=0;
    boolean sentados=false;
    
    int [] mesa=new int [10];
    
    // asigna mesas
    for(int i=0; i<10; i++){
      mesa[i]=(int)(Math.random()*5);
    }
      
    do {
        for(int i=0; i<10; i++){
          System.out.print("La mesa "+ (i+1) + " tiene " +mesa[i] + " comensales\n");
        }

        System.out.print("¿Cuántos son? (Introduzca -1 para salir del restaurante)?");
        comensales =Integer.parseInt(System.console().readLine());
        
        if (comensales>4){
          System.out.print("Lo siento no se admiten más de 4 comensales por mesa, haga grupos mas pequeños\n");
        } 
        else if (comensales <=0){
          System.out.print("Ha salido del restaurante.\n");
          }
        else { //Se asignan comensales para las mesas con 0
            for(int i=0; i<10; i++){
                if ((mesa[i]==0) && (sentados==false)){
                    mesa [i]=mesa[i]+ comensales;
                    System.out.print("Por favor sientese en la mesa "+(i+1)+ "\n");
                    sentados=true;
                }
              }  // si no hay mesas libres se asignan comensales a mesas para compartir
            for(int i=0; i<10; i++){
                if ((mesa[i]==1) && (comensales<=3) && (sentados==false)){
                      mesa [i]=mesa[i]+ comensales;
                      System.out.print("Tendra que compartir mesa sientese en la mesa "+(i+1)+ "\n");
                      sentados=true;   
                  }
                    else if ((mesa[i]==2) &&  (comensales<=2) && (sentados==false)){
                      mesa [i]=mesa[i]+ comensales;
                      System.out.print("Tendra que compartir mesa sientese en la mesa "+(i+1) + "\n");
                      sentados=true;
                    } 
                      else if ((mesa[i]==3) && (comensales<=1) && (sentados==false)){
                        mesa [i]=mesa[i]+ comensales;
                        System.out.print("Tendra que compartir mesa sientese en la mesa "+(i+1)+ "\n");
                        sentados=true;
                      }         
            }    // si no se ha posido sentar nadie se indicara que no hay sitio para esos comensales
            if (sentados ==false){
              System.out.print("No hay sitio para ese numero de comensales\n");
            }   
            sentados=false;
        }  
    }while  (comensales >=0);
  }
}
