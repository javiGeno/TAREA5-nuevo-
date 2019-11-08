
package Controlador;


import java.io.*;
import java.util.Date;


public class FileModif {
    
    private static File ficheroLogErrores;
    private static  BufferedWriter fichWrit;
   
    
    private static void abrirFichero()
    {
        ficheroLogErrores=new File("Errores");
        try {
            fichWrit=new BufferedWriter(new FileWriter(ficheroLogErrores, true));
            
            System.out.println("fichero abierto correctamente");
        } catch (IOException ex) {
            System.out.println("Error al abrir fichero");
        }
        
    }
    
    
    public static void escribir(String mensajeError)
    {
        Date fechaError=new Date();
        String informacionCompleta=fechaError.toString()+" "+mensajeError;
        
        try {
            abrirFichero();
            fichWrit.write(informacionCompleta);
            fichWrit.newLine();
            System.out.println(informacionCompleta);
        
            cerrarFichero();
            
        } catch (IOException ex) {
            System.out.println("Error al escribir fichero");
        }
    }
    
    private static void cerrarFichero()
    {
        try {
            fichWrit.flush();
            fichWrit.close();
            
            System.out.println("fichero cerrado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al cerrar fichero");
        }
        
    }
}
