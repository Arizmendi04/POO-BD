package ei.Controlador;

import ei.Modelo.Entidad.Proveedor;
import ei.Modelo.Repositorio.Repositorio;
import ei.Modelo.Repositorio.RepositorioProveedor;
import java.util.List;

public class ControladorProveedor extends Controlador<Proveedor>{

    private Repositorio<Proveedor> repositorioProveedor = RepositorioProveedor.getInstancia();

    // Singleton del controlador
    private static ControladorProveedor instancia;
    public static ControladorProveedor getInstancia() {
        if (instancia == null) {
            instancia = new ControladorProveedor();
        }
        return instancia;
    }

    @Override
    protected boolean insertObject(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Proveedor getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Proveedor getObject(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean deleteObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean updateObject(Proveedor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<Proveedor> getList(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<Proveedor> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
