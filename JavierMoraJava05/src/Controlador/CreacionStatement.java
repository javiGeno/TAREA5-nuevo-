
package Controlador;

import java.sql.*;


public class CreacionStatement {
    
    private static PreparedStatement statementPreparado;
    private static Statement simpleStatement;
    private static Statement updatableStatement;

    public static PreparedStatement getStatementPreparado(String consulta) throws SQLException {
        
        
       statementPreparado=ConexionValidacion.getConexionBD().prepareStatement(consulta,  ResultSet.CONCUR_UPDATABLE);
        
       
       return statementPreparado;
    }

    

    public static Statement getSimpleStatement() throws SQLException {
        
        simpleStatement=ConexionValidacion.getConexionBD().createStatement();
        
        return simpleStatement;
    }

    

    public static Statement getUpdatableStatement() throws SQLException {
        
        updatableStatement=ConexionValidacion.getConexionBD().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        return updatableStatement;
    }

    
    
    
}
