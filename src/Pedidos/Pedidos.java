/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedidos;

/**
 *
 * @author argue
 */
public class Pedidos {
    
    private String producto;
    private int precio;
    private int cantidad;
    private double precioTotal;

    public Pedidos(String producto, int precio, int cantidad, double precioTotal) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "producto=" + producto + ", precio=" + precio + ", cantidad=" + cantidad + ", precioTotal=" + precioTotal + '}';
    }

}
