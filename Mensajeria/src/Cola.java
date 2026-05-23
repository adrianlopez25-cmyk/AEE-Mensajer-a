import java.util.LinkedList; // Import para usar linkedList

/**
 * @author Adrian Lopez Atalaya
 * @author Daniel Jimenez Ramirez
 */
public class Cola {
    // Atributos:
    private LinkedList<Object> tCola;

    // Constructor:
    public Cola() { // Este es el constructor por defecto que crea la cola vacia
        tCola = new LinkedList<Object>();
    }

    // Metodos:
    public void meterEnCola(Object obj) {
        tCola.add(obj); // Recibe un objeto y lo mete en la lista pero lo añade al final de la cola
    }
    
    public boolean esColaVacia() {
        return tCola.isEmpty(); // Devuelve verdadero si esta vacia o falso si tiene algun mensaje
    }

    public Object sacarDeCola() {
        Object obj;
        if (esColaVacia()) { // Llamamos al metodo esColaVacia para saber si tenemos algun mensaje dentro
            System.out.println("La cola no tiene ningun mensaje"); 
            obj = new Object();  // Creamos un objeto vacio para poder devolver algo
        } else { // Si hay algun mensaje dentro eliminaremos el de la posicion 0 es decir eliminamos el primer mensaje que entro
            obj = tCola.remove(0);
        }
        return obj; // Devuelve el objeto sacado de la cola
    }
}       