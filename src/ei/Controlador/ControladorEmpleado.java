package ei.Controlador;

import ei.Modelo.Entidad.Empleado;
import ei.Modelo.Repositorio.Repositorio;
import ei.Modelo.Repositorio.RepositorioEmpleado;
import java.util.List;

public class ControladorEmpleado extends Controlador<Empleado>{

    private Repositorio<Empleado> repositorioEmpleado = RepositorioEmpleado.getInstancia();
    
    // Singleton del controlador
    private static ControladorEmpleado instancia;
    public static ControladorEmpleado getInstancia() {
        if (instancia == null) {
            instancia = new ControladorEmpleado();
        }
        return instancia;
    }

    @Override
    protected boolean insertObject(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Empleado getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Empleado getObject(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean deleteObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean updateObject(Empleado objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<Empleado> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<Empleado> getList(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
