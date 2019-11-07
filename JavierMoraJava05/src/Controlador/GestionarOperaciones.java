
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
    
   
    
    public static Object todasComposicionesDePedido(String consulta) throws  Errores
    {
       //si aun no se ha montado el statement
       if(statementTablaComposicion==null)
       {
           
            statementTablaComposicion= CreacionStatement.getUpdatableStatement();
       }
        
       try
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
       catch(SQLException e)
       {
           FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
       }

        
        
    }
    
    public static Object todosProductos(String consulta) throws Errores
    {
        
        statementTablaProducto= CreacionStatement.getSimpleStatement();
        
        try
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
        catch(SQLException e)
        {
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }

        
        
    }
    
    
    public static int insertarComposicion(String sentencia) throws Errores
    {
        //si aun no se ha montado el statement
        if(statementTablaComposicion==null)
        {
            
             statementTablaComposicion= CreacionStatement.getUpdatableStatement();
        }
           
         
        int resultado;
        try {
            
            resultado = statementTablaProducto.executeUpdate(sentencia);
        
        } catch (SQLException ex) {
            FileModif.escribir(ex.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
         
         return resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private static Productos rellenaProducto(ResultSet resultado) throws Errores 
    {
        Productos filaObtenida = new Productos();
        
        try
        {
            filaObtenida.setCodigoProducto(resultado.getInt(1));
            filaObtenida.setPrecioSinIva(resultado.getFloat(2));
            filaObtenida.setDescripcion(resultado.getString(3));
            filaObtenida.setCategoria(resultado.getString(4));
        }
        catch(SQLException e)
        {
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
        return filaObtenida;
    }
    
   
    private static Composicion rellenaCompo(ResultSet resultado) throws Errores 
    {
        Composicion filaObtenida = new Composicion();
        
        try
        {
            filaObtenida.setPedComposicion(resultado.getInt(1));
            filaObtenida.setProComposicion(resultado.getInt(2));
            filaObtenida.setCantidad(resultado.getInt(3));
            filaObtenida.setPrecioConIva(resultado.getFloat(4));
        }
        catch(SQLException e)
        {
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
        return filaObtenida;
    }
    
    private static int cantidadFilas(ResultSet result) throws Errores  
    {
        int numFilas;
        
        try
        {
            result.last();
            numFilas=result.getRow();
            result.beforeFirst();
        }
        catch(SQLException e)
        {
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
        
        return numFilas;
    }
}
