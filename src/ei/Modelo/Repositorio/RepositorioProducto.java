package ei.Modelo.Repositorio;

import ei.Modelo.Entidad.Producto;

public class RepositorioProducto extends Repositorio<Producto>{
    
    private static Repositorio<Producto> instancia;
    
    public static Repositorio<Producto> getInstancia(){
        if(instancia == null){
            instancia = new RepositorioProducto();
        }
        return instancia;
    }
    
}
