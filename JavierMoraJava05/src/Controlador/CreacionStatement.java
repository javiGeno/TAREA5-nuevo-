
package Controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreacionStatement {
    
    private static PreparedStatement statementPreparado;
    private static Statement simpleStatement;
    private static Statement updatableStatement;

    public static PreparedStatement getStatementPreparado(String consulta)  {
        
       
        try {
            statementPreparado=ConexionValidacion.getConexionBD().prepareStatement(consulta,  ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            
            //System.out.println(ex.ex.getMessage());
        }
       
       
        
       
       return statementPreparado;
    }

    

    public static Statement getSimpleStatement() {
        
        try
        {
            simpleStatement=ConexionValidacion.getConexionBD().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }
        catch(SQLException e)
        {
            //instanciar error y lanzar
        }
        return simpleStatement;
    }

    

    public static Statement getUpdatableStatement()  {
        
        try {
            updatableStatement=ConexionValidacion.getConexionBD().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
           
            //instanciar error y lanzar
        }
        
        return updatableStatement;
    }

    
    
    
}
