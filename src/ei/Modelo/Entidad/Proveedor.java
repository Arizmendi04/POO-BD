package ei.Modelo.Entidad;

public class Proveedor {
    
    private int idProveedor;
    private String nombre;
    private String contacto;
    private String telefono;
    private String direccion;

    // Constructor con valores inicializados
    public Proveedor() {
        idProveedor = 0;
        nombre = "";
        contacto = "";
        telefono = "";
        direccion = "";
    }

    // Constructor que recibe todos los parámetros
    public Proveedor(int idProveedor, String nombre, String contacto, String telefono, String direccion) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombre + ", contacto=" + contacto + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
}
