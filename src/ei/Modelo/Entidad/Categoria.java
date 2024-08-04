package ei.Modelo.Entidad;

public class Categoria {
    
    private int idCategoria;
    private String nombre;

    // Constructor con valores inicializados
    public Categoria() {
        idCategoria = 0;
        nombre = "";
    }

    // Constructor que recibe todos los parámetros
    public Categoria(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nombre=" + nombre + '}';
    }
    
}
