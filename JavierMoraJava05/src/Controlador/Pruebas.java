
package Controlador;

import Modelo.Composicion;
import Modelo.ConsultasComposicion;
import Modelo.ConsultasProductos;
import Modelo.Productos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;


public class Pruebas {

    
   /* public static void main(String[] args) throws SQLException {
       
        
    
        if(ConexionValidacion.realizarConexionPostgres() && ConexionValidacion.realizarConexionMysql())
        {
            System.out.println("La conexion ha sido correcta");
        }
        else
        {
            System.out.println("Ha ocurrido un problema con la base de datos");
            System.exit(0);
        }
        
        if(ConexionValidacion.realizaStatementValidacion("1111", "hola"))
        {
            System.out.println(ConexionValidacion.getUsuario());
        }
        else
        {
            System.out.println("No conection");
        }
        
        GestionarPedidos ge=new GestionarPedidos("hola");
        
        /*ConsultasComposicion composiciones=new ConsultasComposicion(8);
        
        Object composicionesPedido=composiciones.obtenerResultadoSelectComposicion();
         
        if(composicionesPedido instanceof ArrayList)
        {
            Iterator i=((ArrayList) composicionesPedido).iterator();
            Composicion c;
            
            while(i.hasNext())
            {
                c=(Composicion) i.next();
                System.out.println(c.getPedComposicion());
                System.out.println(c.getProComposicion());
                System.out.println(c.getCantidad());
                System.out.println(c.getPrecioConIva());
            }
            System.out.println("Aqui no debe entrar");
        }
        else
        {
            Composicion c=(Composicion) composicionesPedido;
            
            System.out.println(c.getPedComposicion());
            System.out.println(c.getProComposicion());
            System.out.println(c.getCantidad());
            System.out.println(c.getPrecioConIva());
           
        }
        
        ConsultasProductos productos=new ConsultasProductos();
        
        Object  pro= productos.obtenerResultadoSelectComposicion();
         
        if(pro instanceof ArrayList)
        {
            Iterator i=((ArrayList) pro).iterator();
            Productos p;
            
            while(i.hasNext())
            {
                p=(Productos) i.next();
                System.out.println(p.getCodigoProducto());
                System.out.println(p.getPrecioSinIva());
                System.out.println(p.getDescripcion());
                System.out.println(p.getCategoria());
            }
            System.out.println("Aqui no debe entrar");
        }
        else
        {
            Productos p=(Productos) pro;
            
            System.out.println(p.getCodigoProducto());
                System.out.println(p.getPrecioSinIva());
                System.out.println(p.getDescripcion());
                System.out.println(p.getCategoria());
           
        }
    }*/
}
