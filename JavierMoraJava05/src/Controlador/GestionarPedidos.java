
package Controlador;

import Modelo.ConsultasPedido;
import Modelo.Pedidos;
import java.sql.*;
import java.util.GregorianCalendar;


public class GestionarPedidos {
    
    private String usuario;
    private PreparedStatement statementPedidos;
    private ResultSet resultadoConsulta;
    private Pedidos pedido;
    private int numFilas;
    
    public GestionarPedidos(String usuario) throws SQLException
    {
        this.usuario=usuario;
        
        
        montarStatement ();
        creacionResultSet();//lanzara la exepcion si no hay pedidos y se capturara en la vista para mostrar el mensaje
        calcularFilasPedidos();//Se calculan el numero de filas para controlar los pedidos
        pedido=new Pedidos();
        
    }
    
    private void  montarStatement () 
    {
        ConsultasPedido consultaPedidos=new ConsultasPedido();
        String consul=consultaPedidos.getConsultaPedidos();
        
        try
        {
            statementPedidos=ConexionValidacion.getConexionBD().prepareStatement(consul, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        
        
        
    }
    
    private void creacionResultSet() throws SQLException
    {
        
           statementPedidos.setString(1, usuario);
           resultadoConsulta=statementPedidos.executeQuery();
           
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public int getNumFilas() {
        return numFilas;
    }
    
    
    
    private void calcularFilasPedidos()
    {
        
        
         try
         {
            resultadoConsulta.last();
            numFilas=resultadoConsulta.getRow();//devuelve el numero de la ultima 
            resultadoConsulta.beforeFirst();
          
            
         }
         catch(SQLException e)
         {
             
             
         }
         
         
            
    }
    
    public Pedidos obtenerSigPed()
    {
        
        
        
        try{    
            if(resultadoConsulta.next())
            {
                pedido.setNumeroPedido(resultadoConsulta.getInt("num_pedido"));
                pedido.setNif(resultadoConsulta.getString("NIF"));
                pedido.setCodigoPostal(resultadoConsulta.getString("codigo_pos"));

                Date d=resultadoConsulta.getDate("fecha_ped");
                pedido.setFechaPedido(new GregorianCalendar(), d);

                pedido.setDireccion(resultadoConsulta.getString("direccion"));
                pedido.setRutaFoto(resultadoConsulta.getString("imagen"));
                pedido.setUsuPedidos(resultadoConsulta.getString("usu_pedidos"));

                return pedido;
            }
           
        }
        catch(SQLException e)
        {
            
        }
        
        return null;//no hay pedidos 
    }
    
    public Pedidos obtenerAnteriorPed()
    {
        
        
        
        try{    
           
            if(resultadoConsulta.previous())
           {
               pedido.setNumeroPedido(resultadoConsulta.getInt("num_pedido"));
               pedido.setNif(resultadoConsulta.getString("NIF"));
               pedido.setCodigoPostal(resultadoConsulta.getString("codigo_pos"));
               
               Date d=resultadoConsulta.getDate("fecha_ped");
               pedido.setFechaPedido(new GregorianCalendar(), d);
               
               pedido.setDireccion(resultadoConsulta.getString("direccion"));
               pedido.setRutaFoto(resultadoConsulta.getString("imagen"));
               pedido.setUsuPedidos(resultadoConsulta.getString("usu_pedidos"));
               
               return pedido;
           }
           
        }
        catch(SQLException e)
        {
            return null;//no hay pedidos
        }
        
        return null;//no hay pedidos 
    }
    
    public boolean esElUltimo()
    {
         try
         {
            if(resultadoConsulta.isLast())
            {
                  return true;
            }
            else
            {
                return false;
            }
         }
         catch(SQLException e)
         {
             return false;
         }
        
    }
    
    public boolean esElPrimero()
    {
         try
         {
            if(resultadoConsulta.isFirst())
            {
                  return true;
            }
            else
            {
                return false;
            }
         }
         catch(SQLException e)
         {
             return false;
         }
        
    }
    
    public Pedidos obtenerPrimero()
    {
        
        
        try{
            if(resultadoConsulta.first())
            {
                
                pedido.setNumeroPedido(resultadoConsulta.getInt("num_pedido"));
                pedido.setNif(resultadoConsulta.getString("NIF"));
                pedido.setCodigoPostal(resultadoConsulta.getString("codigo_pos"));

                Date d=resultadoConsulta.getDate("fecha_ped");
                pedido.setFechaPedido(new GregorianCalendar(), d);

                pedido.setDireccion(resultadoConsulta.getString("direccion"));
                pedido.setRutaFoto(resultadoConsulta.getString("imagen"));
                pedido.setUsuPedidos(resultadoConsulta.getString("usu_pedidos"));
                
                return pedido;
            }
            else
            {
                return null;
                
            }
        }
        catch(SQLException e)
        {
            return null;
        }
        
    }
    
    public Pedidos obtenerUltimo()
    {
        try{
            if(resultadoConsulta.last())
            {
            
                pedido.setNumeroPedido(resultadoConsulta.getInt("num_pedido"));
                pedido.setNif(resultadoConsulta.getString("NIF"));
                pedido.setCodigoPostal(resultadoConsulta.getString("codigo_pos"));

                Date d=resultadoConsulta.getDate("fecha_ped");
                pedido.setFechaPedido(new GregorianCalendar(), d);

                pedido.setDireccion(resultadoConsulta.getString("direccion"));
                pedido.setRutaFoto(resultadoConsulta.getString("imagen"));
                pedido.setUsuPedidos(resultadoConsulta.getString("usu_pedidos"));
                
                return pedido;
            }
            else
            {
                return null;
            }
            
            
        }
        catch(SQLException e)
        {
            return null;
        }
        
    }
    
    public void modificarPedido(Pedidos pedido)
    {
        
        try
        {
            java.util.Date fechaPrograma=pedido.getFechaPedido().getTime();
            java.sql.Date fechaBase = new Date(fechaPrograma.getTime()) ;
            
            resultadoConsulta.updateDate("fecha_ped", fechaBase);
            resultadoConsulta.updateString("imagen", pedido.getRutaFoto());
            
            resultadoConsulta.updateRow();
        }
        catch(SQLException e)
        {
            
        }
        
        
    }
    
    
}
