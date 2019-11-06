
package Controlador;

import Modelo.*;
import java.sql.*;
import java.util.*;


public class GestionarOperaciones {

    
    private static Statement statementTablaProducto;
    private static Statement statementTablaComposicion;
    
    
    public GestionarOperaciones() throws SQLException
    {
        statementTablaProducto=CreacionStatement.getSimpleStatement();
        statementTablaComposicion=CreacionStatement.getUpdatableStatement();
    }
    
    public static Object todasComposicionesDePedido(String consulta) throws SQLException
    {
       
        ResultSet resultado=statementTablaComposicion.executeQuery(consulta);
       
        int numeroFilasConsulta=cantidadFilas(resultado);
        
        if(numeroFilasConsulta>1)
        {
            ArrayList <Composicion> filasObtenidas = new ArrayList<Composicion>();
            
            
            while(resultado.next())
            {
                Composicion nueva=rellenaCompo(resultado);
                
                filasObtenidas.add(nueva);
                
            }
            
            resultado.close();
            return filasObtenidas;
                
        }
        else
        {
              
                Composicion filaObtenida;

                resultado.first();

               
                filaObtenida=rellenaCompo(resultado);
               
                resultado.close();
                return filaObtenida;
        }
        
        
        
    }
    
    public static Object todosProductos(String consulta) throws SQLException
    {
    
        
        ResultSet resultado=statementTablaProducto.executeQuery(consulta);
        
        int numeroFilasConsulta=cantidadFilas(resultado);
        
        if(numeroFilasConsulta>1)
        {
            ArrayList <Productos> filasObtenidas = new ArrayList<Productos>();
            Productos nueva;
            
            
            while(resultado.next())
            {
                Productos nuevo=rellenaProducto(resultado);
                
                filasObtenidas.add(nuevo);
                
            }
            
            resultado.close();
            return filasObtenidas;
                
        }
        else
        {
              
                Productos filaObtenida;

                resultado.first();

                filaObtenida=rellenaProducto(resultado);

                resultado.close();
                return filaObtenida;
        }
        
        
        
    }
    
    
    public static int insertarComposicion(String sentencia) throws SQLException
    {
       
         int resultado=statementTablaProducto.executeUpdate(sentencia);
        
         
         return resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private static Productos rellenaProducto(ResultSet resultado) throws SQLException
    {
        Productos filaObtenida = new Productos();
        
        filaObtenida.setCodigoProducto(resultado.getInt(1));
        filaObtenida.setPrecioSinIva(resultado.getFloat(2));
        filaObtenida.setDescripcion(resultado.getString(3));
        filaObtenida.setCategoria(resultado.getString(4));
        
        return filaObtenida;
    }
    
   
    private static Composicion rellenaCompo(ResultSet resultado) throws SQLException
    {
        Composicion filaObtenida = new Composicion();
        
        filaObtenida.setPedComposicion(resultado.getInt(1));
        filaObtenida.setProComposicion(resultado.getInt(2));
        filaObtenida.setCantidad(resultado.getInt(3));
        filaObtenida.setPrecioConIva(resultado.getFloat(4));
        
        return filaObtenida;
    }
    
    private static int cantidadFilas(ResultSet result) throws SQLException 
    {
        int numFilas;
        
        result.last();
        numFilas=result.getRow();
        result.beforeFirst();
        
        
        return numFilas;
    }
}
