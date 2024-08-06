package ei.Modelo.Repositorio;

import ei.Modelo.Entidad.Proveedor;

public class RepositorioProveedor extends Repositorio<Proveedor>{
    
    private static Repositorio<Proveedor> instancia;
    
    public static Repositorio<Proveedor> getInstancia(){
        if(instancia == null){
            instancia = new RepositorioProveedor();
        }
        return instancia;
    }
    
}
