package Controlador;


import javax.swing.JOptionPane;


public class Errores extends Exception{
    
    public final static int FECHA_NO_VALIDA = 1;
    public final static int NIF_NO_REGISTRADO=2;
    public final static int ERRORES_BD=3;
    public final static int ERROR_CONEXION=4;
    private int error;
    
    public  Errores(int num)
    {
        error=num;
        
    }

    public int getError() {
        return error;
    }
    
    public String mostrarError()
    {
       
           return error+": "+CodigoErrores.mensajeError(error);
            
        
        
    }
    
    
    
    
}
