package tema9.medico;

import java.time.LocalDate;

public class PacConsulta extends Paciente {
    String motivo;
    
    public PacConsulta(String nombre, LocalDate fecNac, String motivo){
        super(nombre, fecNac);
        this.motivo = motivo;
    }
    
    
    
    @Override
    public void facturar(){
        
    }
    
}
