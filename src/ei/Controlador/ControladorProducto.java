package ei.Controlador;

import ei.Modelo.Entidad.Producto;
import ei.Modelo.Repositorio.Repositorio;
import ei.Modelo.Repositorio.RepositorioProducto;
import java.util.List;

public class ControladorProducto extends Controlador<Producto>{

    private Repositorio<Producto> repositorioProducto = RepositorioProducto.getInstancia();

    // Singleton del controlador
    private static ControladorProducto instancia;
    public static ControladorProducto getInstancia() {
        if (instancia == null) {
            instancia = new ControladorProducto();
        }
        return instancia;
    }

    @Override
    protected boolean insertObject(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Producto getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Producto getObject(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean deleteObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean updateObject(Producto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<Producto> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<Producto> getList(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
