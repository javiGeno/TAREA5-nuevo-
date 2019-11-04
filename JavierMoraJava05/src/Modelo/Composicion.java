
package Modelo;


public class Composicion {
    
    private int proComposicion;
    private  int pedComposicion;
    private int cantidad;
    private float precioConIva;
    
    public Composicion()
    {
        
    }

    public int getProComposicion() {
        return proComposicion;
    }

    public void setProComposicion(int proComposicion) {
        this.proComposicion = proComposicion;
    }

    public int getPedComposicion() {
        return pedComposicion;
    }

    public void setPedComposicion(int pedComposicion) {
        this.pedComposicion = pedComposicion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioConIva() {
        return precioConIva;
    }

    public void setPrecioConIva(float precioConIva) {
        this.precioConIva = precioConIva;
    }
 
}
