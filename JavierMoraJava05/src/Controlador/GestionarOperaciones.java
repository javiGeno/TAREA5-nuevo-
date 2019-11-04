
package Controlador;

import Modelo.*;
import java.sql.*;
import java.util.*;


public class GestionarOperaciones {

    
    
    
    
    public GestionarOperaciones()
    {
        
        
    }
    
    public static Object todasComposicionesDePedido(String consulta) throws SQLException
    {
        

        Statement statement=CreacionStatement.getUpdatableStatement();
        
        ResultSet resultado=statement.executeQuery(consulta);
        
        if(cantidadFilas(resultado)>1)
        {
            ArrayList <Composicion> filasObtenidas = new ArrayList<Composicion>();
            Composicion nueva;
            int cont=0;
            
            while(resultado.next())
            {
                nueva=new Composicion();
                
                nueva.setPedComposicion(resultado.getInt(1));
                nueva.setProComposicion(resultado.getInt(2));
                nueva.setCantidad(resultado.getInt(3));
                nueva.setPrecioConIva(resultado.getFloat(4));
                
                
                filasObtenidas.add(nueva);
                
            }
            
            return filasObtenidas;
                
        }
        else
        {
              
                Composicion filaObtenida = new Composicion();

                resultado.first();

                filaObtenida.setPedComposicion(resultado.getInt(1));
                filaObtenida.setProComposicion(resultado.getInt(2));
                filaObtenida.setCantidad(resultado.getInt(3));
                filaObtenida.setPrecioConIva(resultado.getFloat(4));

                System.out.println("Entrado en una fila");

                return filaObtenida;
        }
        
        
        
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
