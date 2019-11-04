
package Modelo;

import java.util.*;


public class ConsultasPedido {
    
    private String consultaPedidos="select * from PEDIDOS where usu_pedidos=?";
    
    public ConsultasPedido()
    {
        
        
    }

    public String getConsultaPedidos() {
        return consultaPedidos;
    }

   

    
    
    
}
