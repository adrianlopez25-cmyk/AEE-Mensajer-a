/**
 * @author Adrian Lopez Atalaya
 * @author Daniel Jimenez Ramirez
 */
public class Mensajeria {

    // Cola global de mensajes
    private static Cola cola = new Cola();

    public static void main(String[] args) {
        // Entorno:
        short opcion;
        
        // Algoritmo:
        do {
            System.out.println("1. Envio instantaneo");
            System.out.println("2. Enviar mensaje");
            System.out.println("3. Recibir mensaje");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Leer.datoShort();
            switch (opcion) {
                case 1:
                    envioInstantaneo();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
    }
    // Metodos
    private static void envioInstantaneo() {
        Mensaje msg = new Mensaje(); // Creamos un mensaje instantaneo con el constructor por defecto
        cola.meterEnCola(msg); // Metemos el mensaje en la cola
        System.out.println("Mensaje instantaneo añadido a la cola.");
    }
}


