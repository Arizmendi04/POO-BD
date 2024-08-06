package ei.Modelo.Repositorio;

import ei.Modelo.Entidad.OrdenCompra;

public class RepositorioOrdenCompra extends Repositorio<OrdenCompra>{
    
    private static Repositorio<OrdenCompra> instancia;
    
    public static Repositorio<OrdenCompra> getInstancia(){
        if(instancia == null){
            instancia = new RepositorioOrdenCompra();
        }
        return instancia;
    }
    
}
