package entidades;

public class Oferta {

    private String fechaInicio;
    private String fechaVigencia;
    private Producto producto;
    private int porcentaje;

    public Oferta() {
        producto = new Producto();
    }

    public Oferta(String fechaInicio, String fechaVigencia, Producto producto, int porcentaje) {
        this.fechaInicio = fechaInicio;
        this.fechaVigencia = fechaVigencia;
        this.producto = producto;
        this.porcentaje = porcentaje;
        producto = new Producto();
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    @Override
    public String toString() {
        return "Oferta{" + "fechaInicio=" + fechaInicio + ", fechaVigencia=" + fechaVigencia + ", producto=" + producto.toString() + '}';
    }

    public float calcularOferta() {
        float precioConOferta = 0;

        precioConOferta -= ((producto.getPrecio() * porcentaje) / 100);

        return precioConOferta;
    }

    public void agregarProducto(Producto producto) {
        this.producto = producto;
    }

}
