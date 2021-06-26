package entidades;

public class Producto {

    private int numero;
    private String nombre;
    private float precio;
    private int stock;

    public Producto() {
    }

    public Producto(int numero, String nombre, float precio, int stock) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "numero=" + numero + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
}
