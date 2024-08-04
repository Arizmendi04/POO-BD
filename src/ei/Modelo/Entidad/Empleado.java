package ei.Modelo.Entidad;

import java.util.Date;

public class Empleado {
    
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String posicion;
    private double salario;
    private Date fechaContratacion;

    // Constructor con valores inicializados
    public Empleado() {
        idEmpleado = 0;
        nombre = "";
        apellido = "";
        posicion = "";
        salario = 0;
        fechaContratacion = new Date();
    }

    // Constructor que recibe todos los parámetros
    public Empleado(int idEmpleado, String nombre, String apellido, String posicion, double salario, Date fechaContratacion) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", salario=" + salario + ", fechaContratacion=" + fechaContratacion + '}';
    }
    
}
