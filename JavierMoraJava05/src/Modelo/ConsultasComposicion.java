
package Modelo;

import Controlador.Errores;
import Controlador.GestionarOperaciones;
import java.sql.SQLException;
import java.util.ArrayList;


public class ConsultasComposicion {
    
     private String consultasSelectComposicion="select * from composicion where ped_composicion=";
     private String inserccionComposicion="insert into composicion values(";
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

    
     
    public Object obtenerResultadoSelectComposicion() throws Errores 
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

    public String getConsultasInsertComposicion(int cant, float precIva, int pro) {
        
        
        return inserccionComposicion + numeroPedido +", " +pro+ ", "+ cant+ ", "+ precIva +");";
        
    }
     
    public int inserccionComposicion(int cant, float precIva, int pro) throws Errores 
    {
        int filasInsertadas;
        
        filasInsertadas=GestionarOperaciones.insertarComposicion(getConsultasInsertComposicion(cant, precIva, pro));
       
        
        return filasInsertadas;
    }
}
