
package Modelo;

import Controlador.GestionarOperaciones;
import java.sql.SQLException;
import java.util.ArrayList;


public class ConsultasComposicion {
    
     private String consultasSelectComposicion="select * from composicion where ped_composicion=";
     private String consultasInsertComposicion;
     private Composicion compo;
     private int numeroPedido;
     private ArrayList<Composicion> listaCompo;
     
     public ConsultasComposicion(int  numPedido)
     {
         numeroPedido=numPedido;
         
     }

    public String getConsultasSelectComposicion() {
       
      
        return consultasSelectComposicion+numeroPedido;
    }

    
     
    public Object obtenerResultadoSelectComposicion() throws SQLException
    {
        Object resultado;
        resultado=GestionarOperaciones.todasComposicionesDePedido(getConsultasSelectComposicion());
        
        if(resultado instanceof ArrayList)
        {
            listaCompo=(ArrayList<Composicion>) resultado;
        }
        else
        {
            compo=(Composicion) resultado;
        }
        
        return resultado;
    }
     
}
