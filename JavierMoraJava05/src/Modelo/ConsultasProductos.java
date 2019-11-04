
package Modelo;

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

    public void setConsulasProductos(String consulasProductos) {
        this.consulasProductos = consulasProductos;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public ArrayList<Productos> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Productos> listaProducto) {
        this.listaProducto = listaProducto;
    }
     
     
}
