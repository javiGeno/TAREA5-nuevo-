
package Controlador;

import Modelo.ConsultasPedido;
import Modelo.Pedidos;
import java.sql.*;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionarPedidos {
    
    private String usuario;
    private PreparedStatement statementPedidos;
    private ResultSet resultadoConsulta;
    private Pedidos pedido;
    private int numFilas;
    
    public GestionarPedidos(String usuario) throws Errores
    {
        this.usuario=usuario;
        
        
        montarStatement ();
        creacionResultSet();//lanzara la exepcion si se produce un problema
        calcularFilasPedidos();//Se calculan el numero de filas para controlar los pedidos
        pedido=new Pedidos();
        
    }
    
    private void  montarStatement () throws Errores 
    {
        ConsultasPedido consultaPedidos=new ConsultasPedido();
        String consul=consultaPedidos.getConsultaPedidos();
        
        try
        {
            statementPedidos=ConexionValidacion.getConexionBD().prepareStatement(consul, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        }
        catch(SQLException e)
        {
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
           
        }
        
        
        
    }
    
    private void creacionResultSet() throws Errores 
    {
        
        try {
            statementPedidos.setString(1, usuario);
        } catch (SQLException ex) {
            FileModif.escribir(ex.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        try {
            resultadoConsulta=statementPedidos.executeQuery();
        } catch (SQLException ex) {
            FileModif.escribir(ex.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
           
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public int getNumFilas() {
        return numFilas;
    }
    
    
    
    private void calcularFilasPedidos() throws Errores
    {
        
        
         try
         {
            resultadoConsulta.last();
            numFilas=resultadoConsulta.getRow();//devuelve el numero de la ultima 
            resultadoConsulta.beforeFirst();
          
            
         }
         catch(SQLException e)
         {
             FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
             
         }
         
         
            
    }
    
    public Pedidos obtenerSigPed() throws Errores
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
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
        return null;//no hay pedidos 
    }
    
    public Pedidos obtenerAnteriorPed() throws Errores
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
           FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
        return null;//no hay pedidos 
    }
    
    public boolean esElUltimo() throws Errores
    {
         try
         {
             return resultadoConsulta.isLast();
         }
         catch(SQLException e)
         {
             FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
         }
        
    }
    
    public boolean esElPrimero() throws Errores
    {
         try
         {
             return resultadoConsulta.isFirst();
         }
         catch(SQLException e)
         {
             FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
         }
        
    }
    
    public Pedidos obtenerPrimero() throws Errores
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
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
    }
    
    public Pedidos obtenerUltimo() throws Errores
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
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
    }
    
    public int modificarPedido(Pedidos pedido) throws Errores
    {
        
        
        try
        {
          
            
            java.util.Date fechaPrograma=pedido.getFechaPedido().getTime();
            java.sql.Date fechaBase = new Date(fechaPrograma.getTime()) ;
            
            resultadoConsulta.updateDate("fecha_ped", fechaBase);
            resultadoConsulta.updateString("imagen", pedido.getRutaFoto());
            
           
            resultadoConsulta.updateRow();
           
            //mirar como devuelve cuantas filas actualizadas
            return 1;
            
        }
        catch(SQLException e)
        {
            FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
        
    }
    
   public int inserccionPedido(Pedidos ped) throws Errores
   {
       try
        {
          
            resultadoConsulta.moveToInsertRow();
            
            resultadoConsulta.updateInt(1, ped.getNumeroPedido());
            resultadoConsulta.updateString(2, ped.getNif());
            resultadoConsulta.updateString(3, ped.getCodigoPostal());
            resultadoConsulta.updateString(5, ped.getDireccion());
            resultadoConsulta.updateString(6, ped.getRutaFoto());
            resultadoConsulta.updateString(7, ped.getUsuPedidos());
            
            java.util.Date fechaPrograma=ped.getFechaPedido().getTime();
            java.sql.Date fechaBase = new Date(fechaPrograma.getTime()) ;
            
            resultadoConsulta.updateDate(4, fechaBase);
            
            resultadoConsulta.insertRow();
            resultadoConsulta.first();//coloco el resultset al principio
            
            //mirar como devuelve cuantas filas actualizadas
            return 1;
            
        }
        catch(SQLException e)
        {
           FileModif.escribir(e.getMessage());
            throw new Errores(Errores.ERRORES_BD);
        }
        
       
   }
    
    
    
}
