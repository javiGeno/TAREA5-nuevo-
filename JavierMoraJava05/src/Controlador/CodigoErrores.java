
package Controlador;


public class CodigoErrores {
    
    
    public static String mensajeError(int numError)
    {
         switch(numError)
        {
            case 1: return "La fecha no puede ser superior a la actual";
            case 2: return "El nif no es invalido";
            case 3: return "Error en la base de datos";
            case 4: return "Datos incorrectos";
            default: return "";
        
        
        }
         
        
    }
}
