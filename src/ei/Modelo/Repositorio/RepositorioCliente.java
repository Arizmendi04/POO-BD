package ei.Modelo.Repositorio;

import ei.Modelo.Entidad.Cliente;

public class RepositorioCliente extends Repositorio<Cliente>{
    
    private static Repositorio<Cliente> instancia;
    
    public static Repositorio<Cliente> getInstancia(){
        if(instancia == null){
            instancia = new RepositorioCliente();
        }
        return instancia;
    }
    
}
