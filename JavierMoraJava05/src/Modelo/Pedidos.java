
package Modelo;

import java.util.*;
import javax.swing.*;

public class Pedidos {
    
    private int numeroPedido;
    private String nif;
    private String codigoPostal;
    private GregorianCalendar fechaPedido;
    private String direccion;
    private String rutaFoto;
    private String usuPedidos; 
            
            
    public Pedidos()
    {
        
        
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public GregorianCalendar getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(GregorianCalendar fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
     public void setFechaPedido(GregorianCalendar fechaIncorporacion, Date d) {
        this.fechaPedido = fechaIncorporacion;
        this.fechaPedido.setTime(d);
       
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    public String getUsuPedidos() {
        return usuPedidos;
    }

    public void setUsuPedidos(String usuPedidos) {
        this.usuPedidos = usuPedidos;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    
    
}
