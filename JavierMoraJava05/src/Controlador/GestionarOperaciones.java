
package Controlador;

import Modelo.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionarOperaciones {

    
    private static Statement statementTablaProducto;
    private static Statement statementTablaComposicion;
    
    
    public GestionarOperaciones() throws SQLException
    {
        
    }
    
   
    
    public static Object todasComposicionesDePedido(String consulta) throws SQLException
    {
       //si aun no se ha montado el statement
       if(statementTablaComposicion==null)
       {
           System.out.println("entraaaa");
            statementTablaComposicion= CreacionStatement.getUpdatableStatement();
       }
        
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
              if(numeroFilasConsulta==1)
              {
                Composicion filaObtenida;

                resultado.first();

               
                filaObtenida=rellenaCompo(resultado);
               
                resultado.close();
                return filaObtenida;
              }
              else
              {
                  //no hay composiciones en el pedido
                  return null;
              }
        }
        
        
        
    }
    
    public static Object todosProductos(String consulta) throws SQLException
    {
        
        statementTablaProducto= CreacionStatement.getSimpleStatement();
        
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
        //si aun no se ha montado el statement
        if(statementTablaComposicion==null)
        {
            System.out.println("entraaaa");
             statementTablaComposicion= CreacionStatement.getUpdatableStatement();
        }
           
         
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
