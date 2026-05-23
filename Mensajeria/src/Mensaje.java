
import java.util.GregorianCalendar;

/**
 *
 * @author Adrian Lopez Atalaya
 * @author Daniel Jimenez Ramirez

 */
public class Mensaje {
    //Atributos
    private static final String APIPA="169.254.0.1";
    private String usuario;
    private GregorianCalendar fecha;
    private String ip=APIPA;
    private String texto = "POR DEFECTO";
    //Constructores
    public Mensaje(){
        this.usuario="System";
        this.fecha= new GregorianCalendar();
        this.ip=APIPA;
        this.texto= encripta("POR DEFECTO");
    }
    public Mensaje (String usuario,String ip,String texto){
        this.usuario=usuario;
        this.fecha= new GregorianCalendar();
        if (esValida(ip)){
            this.ip=ip;
        } else{
            this.ip= APIPA;
        }
        this.texto=encripta(texto);
    }

    //metodos
    public GregorianCalendar getFecha() {
        return fecha;
    }

    public String getTexto() {
        return desencripta(this.texto);
    }
    private static boolean esValida(String ip){
        //entorno
        boolean ipCorrecta=false;
        //Algoritmo
        if (ip.matches("((25[0-4]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?)\\.){3}(25[0-4]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?)")){
            ipCorrecta = true;
        }
            return ipCorrecta;
    }
    
    private static String encripta(String msg){
        //entorno
        String textoInvertido;
        String textoCifrado = "";
        char caracter;
        char caracterCifrado;
        //Algoritmo
        textoInvertido = reverse(msg);
        textoInvertido = textoInvertido.toUpperCase();

        for (int i = 0; i < textoInvertido.length(); i++) {
            caracter = textoInvertido.charAt(i);
            //filtramos para comprobar que sea una letra
            if (caracter >= 'A' && caracter <= 'Z') {
                //Avanzamos en 3 posiciones el caracter
                caracterCifrado = (char) (caracter + 3);

                if (caracterCifrado > 'Z') {
                    caracterCifrado = (char) (caracterCifrado - 26);
                }
                textoCifrado = textoCifrado + caracterCifrado;
            } else {
                // Si es otro caracter que no sea una letra lo dejamos igual a como estaba
                textoCifrado = textoCifrado + caracter;
            }
        }
    
    return textoCifrado;
}
        
    private static String desencripta (String msg){
    // entorno
        
        String textoDescifrado = "";
        String textoOriginal;
        char caracter;
        char caracterDescifrado;
        
        
    // Algoritmo
        
        for (int i = 0; i < msg.length(); i++) {
            caracter = msg.charAt(i);

            // Al desencriptar damos por supuesto que los carateres ya estan en mayusculas 
            if (caracter >= 'A' && caracter <= 'Z') {

                caracterDescifrado = (char) (caracter - 3);

                if (caracterDescifrado < 'A') {
                    caracterDescifrado = (char) (caracterDescifrado + 26);
                }
                textoDescifrado = textoDescifrado + caracterDescifrado;
            } else {
                // Al igual que antes si es otro tipo de carater lo dejamos igual.
                textoDescifrado = textoDescifrado + caracter;
            }
        }

        textoOriginal = reverse(textoDescifrado);

        return textoOriginal;
    }
    
    private static String reverse(String cad) {
        // Entorno
        String resultado = "";
        String[] palabras={};

        // Algoritmo
        cad = cad.trim().replaceAll("\\s+", " ");
        
        if (!cad.isEmpty()) { 
            palabras = cad.split(" ");
        }
        
        for (String palabraActual : palabras) { 
            String invertirPalabra = "";

            for (int i = palabraActual.length() - 1; i >= 0; i--) {
                invertirPalabra = invertirPalabra + palabraActual.charAt(i);
            }

            resultado = resultado + invertirPalabra + " ";
        }

        return resultado.trim();
    }
    
    
}
