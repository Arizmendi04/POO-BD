package ei.Controlador;

import java.util.List;

public abstract class Controlador<Tipo>{
    
    // Conector necesario para todas las clases que hereden de controlador
    protected Conector conector = new Conector();
    
    public boolean insertarObjeto(Tipo objeto){
        return insertObject(objeto);
    }

    public Tipo obtenerObjeto(int id){
        return getObject(id);
    }
    
    public Tipo obtenerObjeto(String campo){
        return getObject(campo);
    }
    
    public boolean actualizarObjeto(Tipo objeto){
        return updateObject(objeto);
    }
    
    public boolean eliminarObjeto(int id){
        return deleteObject(id);
    }
    
    // Lista completa 
    public List<Tipo> obtenerLista(){
        return getList();
    }
    
    // Lista con filtro por un String
    public List<Tipo> obtenerLista(String campo){
        return getList();
    }
    
    // Metodos para un solo objeto
    protected abstract boolean insertObject(Tipo objeto); //Insertar 
    protected abstract Tipo getObject(int id); // Obtiene un objeto por id
    protected abstract Tipo getObject(String campo); // Obtiene un objeto por un string
    protected abstract boolean deleteObject(int id);
    protected abstract boolean updateObject(Tipo objeto); 
    
    // Metodos para una lista
    protected abstract List<Tipo> getList(); // Obtiene la lista completa
    protected abstract List<Tipo> getList(String campo); // Obtiene una lista con un filtro
    
}
