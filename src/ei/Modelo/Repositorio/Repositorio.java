package ei.Modelo.Repositorio;

import java.util.ArrayList;
import java.util.List;

public abstract class Repositorio<Tipo>{
    
    private List<Tipo> listaDatos;
    
    public Repositorio(){
        listaDatos = new ArrayList<>();
    }
    
    public List<Tipo> getDatos(){
        return listaDatos;
    }
    
    public void setDato(Tipo objeto){
        listaDatos.add(objeto);
    }
    
    public void setDatos(List<Tipo> datos) {
        listaDatos.addAll(datos);
    }
    
}



