/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author 2guzm
 */
public class DetalleFacCompra {
    private String isbn;
    private String titulo;
    private double precioU;
    private double precioT;
    private int cantidad;

    public DetalleFacCompra() {
    }

    public DetalleFacCompra(String isbn, String titulo, double precioU, double precioT, int cantidad) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.precioU = precioU;
        this.precioT = precioT;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    @Override
    public String toString() {
        return "DetalleFacCompra{" + "isbn=" + isbn + ", titulo=" + titulo + ", precioU=" + precioU + ", precioT=" + precioT + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}
