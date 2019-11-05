
package Modelo;

import Controlador.GestionarOperaciones;
import java.sql.SQLException;
import java.util.ArrayList;


public class ConsultasProductos {
    
     private String consulasProductos="select * from productos";
     private Productos producto;
     private ArrayList<Productos> listaProducto;
     
     public ConsultasProductos()
     {
         
         
     }

    public String getConsulasProductos() {
        return consulasProductos;
    }

    public Object obtenerResultadoSelectComposicion() throws SQLException
    {
        Object resultado;
        resultado=GestionarOperaciones.todosProductos(consulasProductos);
        
        if(resultado instanceof ArrayList)
        {
            listaProducto=(ArrayList<Productos>) resultado;
        }
        else
        {
            producto=(Productos) resultado;
        }
        
        return resultado;
    }
     
}
