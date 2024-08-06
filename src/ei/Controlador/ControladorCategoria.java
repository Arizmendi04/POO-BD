package ei.Controlador;

import ei.Modelo.Entidad.Categoria;
import ei.Modelo.Repositorio.Repositorio;
import ei.Modelo.Repositorio.RepositorioCategoria;
import java.awt.Menu;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorCategoria extends Controlador<Categoria>{

    private Repositorio<Categoria> repositorioCategoria = RepositorioCategoria.getInstancia();
    private String nameTable = "categorias";
    private String Query = "";
    
    // Singleton del controlador
    private static ControladorCategoria instancia;
    public static ControladorCategoria getInstancia() {
        if (instancia == null) {
            instancia = new ControladorCategoria();
        }
        return instancia;
    }

    @Override
    protected boolean insertObject(Categoria categoria) {
        Query = "Insert into "+nameTable+" values(0,"+categoria.getNombre()+");";
        try{
            conector.JavaToMySQL();
            if(conector.con != null){
                conector.comando = conector.con.createStatement();
                conector.registro = conector.comando.executeQuery(Query);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "La conexión con la base de datos no se ha establecido correctamente.");
            }
        }catch(SQLException ex){
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    protected Categoria getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Categoria getObject(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean deleteObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected boolean updateObject(Categoria objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<Categoria> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<Categoria> getList(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
