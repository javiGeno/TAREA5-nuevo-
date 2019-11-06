
package Modelo;


public class Productos {
 
    private int codigoProducto;
    private float precioSinIva;
    private String descripcion;
    private String categoria;
    
    public Productos()
    {
        
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public float getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(float precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return ">"+ codigoProducto +"   "+ descripcion + "   PRECIO sin iva: " + precioSinIva+" €"  ;
    }
    
    
}
