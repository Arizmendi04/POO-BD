package ei.Modelo.Repositorio;

import ei.Modelo.Entidad.Empleado;

public class RepositorioEmpleado extends Repositorio<Empleado>{
    
    private static Repositorio<Empleado> instancia;
    
    public static Repositorio<Empleado> getInstancia(){
        if(instancia == null){
            instancia = new RepositorioEmpleado();
        }
        return instancia;
    }
    
}
