package pe.edu.upn.demo01.dto;

public class VentaDto {

    private double precio;
    private int cantidad;
    private double total;

    public VentaDto() {
    }

    public VentaDto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = 0.0;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
