package ei.Modelo.Repositorio;

import ei.Modelo.Entidad.Categoria;

public class RepositorioCategoria extends Repositorio<Categoria>{
    
    private static Repositorio<Categoria> instancia;
    
    public static Repositorio<Categoria> getInstancia(){
        if(instancia == null){
            instancia = new RepositorioCategoria();
        }
        return instancia;
    }
    
}
