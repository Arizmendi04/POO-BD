package ei.Modelo.Entidad;

public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    // Constructor con valores inicializados
    public Cliente(){
        idCliente = 0;
        nombre = "";
        apellido = "";
        direccion = "";
        telefono = "";
        email = "";
    }
    
    // Constructor que recibe todos los parametros
    public Cliente(int idCliente, String nombre, String apellido, String direccion, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
}

