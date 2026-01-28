package tema9.medico;

import java.time.LocalDate;
import java.util.ArrayList;

public class PacRecetas extends Paciente {
    ArrayList<String> listaMedicamentos = new ArrayList<>();
    
    PacRecetas(String nombre, LocalDate dacNac, ArrayList listaMed){
        super(nombre, dacNac);
        listaMedicamentos = listaMed;
    }
    
    public void facturar(){
    
    }
}
