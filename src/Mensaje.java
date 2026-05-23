
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
        
    }
    public Mensaje (String usuario,String ip,String texto){
        this.usuario=usuario;
        this.ip=ip;
        this.texto=texto;
    }

    //metodos
    public GregorianCalendar getFecha() {
        return fecha;
    }

    public String getTexto() {
        return texto;
    }
    private static boolean esValida(String ip){
        //entorno
        boolean ipCorrecta=false;
        //Algoritmo
        if (ip.matches("((25[0-4]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?)\\.){3}(25[0-4]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?)"));{
            ipCorrecta = true;
        }
            return ipCorrecta;
    }
    private static String encripta(String msg){
        
        return "a";
        
    }
    private static String desencripta (String msg){
        
    }
    private String reverse (String cad){
        String fraseInvertida;
        cad = cad.trim().replaceAll("\\s+", " ");
        for(int i=0;i<cad.length();i++){
             char letra = cad.charAt(i);
            if (letra ==' '){
                
                
            }
        }
    }
    
}
