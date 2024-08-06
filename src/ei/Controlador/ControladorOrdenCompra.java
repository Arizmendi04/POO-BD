package ei.Controlador;

import ei.Modelo.Entidad.OrdenCompra;
import ei.Modelo.Repositorio.Repositorio;
import ei.Modelo.Repositorio.RepositorioOrdenCompra;
import java.util.List;

public class ControladorOrdenCompra extends Controlador<OrdenCompra>{

    private Repositorio<OrdenCompra> repositorioOrdenCompra = RepositorioOrdenCompra.getInstancia();
    
    // Singleton del controlador
    private static ControladorOrdenCompra instancia;
    public static ControladorOrdenCompra getInstancia() {
        if (instancia == null) {
            instancia = new ControladorOrdenCompra();
        }
        return instancia;
    }

    @Override
    protected OrdenCompra getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected OrdenCompra getObject(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean deleteObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean updateObject(OrdenCompra objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<OrdenCompra> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<OrdenCompra> getList(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean insertObject(OrdenCompra objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
