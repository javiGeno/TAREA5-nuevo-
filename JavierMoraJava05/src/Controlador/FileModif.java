
package Controlador;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileModif {
    
    private static File ficheroLogErrores;
    private static  BufferedWriter fichWrit;
   
    
    public static void abrirFichero()
    {
        ficheroLogErrores=new File("Errores");
        try {
            fichWrit=new BufferedWriter(new FileWriter(ficheroLogErrores, true));
            
        } catch (IOException ex) {
            System.out.println("Error de fichero");
        }
        
    }
    
    
    public static void escribir(String error)
    {
        try {
            fichWrit.write(error);
            fichWrit.newLine();
        
        } catch (IOException ex) {
            System.out.println("Error de fichero");
        }
    }
    
    public static void cerrarFichero()
    {
        try {
            fichWrit.flush();
            fichWrit.close();
        } catch (IOException ex) {
            System.out.println("Error de fichero");
        }
        
    }
}
