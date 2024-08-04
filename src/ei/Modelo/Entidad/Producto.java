package ei.Modelo.Entidad;

public class Producto {
    
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int idCategoria;
    private int idProveedor;

    // Constructor con valores inicializados
    public Producto() {
        idProducto = 0;
        nombre = "";
        descripcion = "";
        precio = 0.0;
        idCategoria = 0;
        idProveedor = 0;
    }

    // Constructor que recibe todos los parámetros
    public Producto(int idProducto, String nombre, String descripcion, double precio, int idCategoria, int idProveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", idCategoria=" + idCategoria + ", idProveedor=" + idProveedor + '}';
    }
    
}
