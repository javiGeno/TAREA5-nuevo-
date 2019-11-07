
package Controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreacionStatement {
    
    private static PreparedStatement statementPreparado;
    private static Statement simpleStatement;
    private static Statement updatableStatement;

    public static PreparedStatement getStatementPreparado(String consulta) throws Errores  {
        
       
        try {
            statementPreparado=ConexionValidacion.getConexionBD().prepareStatement(consulta,  ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            
            FileModif.escribir(ex.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
       
       
        
       
       return statementPreparado;
    }

    

    public static Statement getSimpleStatement() throws Errores {
        
        try
        {
            simpleStatement=ConexionValidacion.getConexionBD().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }
        catch(SQLException ex)
        {
            FileModif.escribir(ex.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        return simpleStatement;
    }

    

    public static Statement getUpdatableStatement() throws Errores  {
        
        try {
            updatableStatement=ConexionValidacion.getConexionBD().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
           
           FileModif.escribir(ex.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
        return updatableStatement;
    }

    
    
    
}
