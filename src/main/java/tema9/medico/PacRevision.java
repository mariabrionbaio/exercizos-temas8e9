package tema9.medico;

import java.time.LocalDate;

public class PacRevision extends Paciente{
    LocalDate visitaAnt;
    
    PacRevision(String nombre, LocalDate fecNac, LocalDate visitaAnt){
        super(nombre, fecNac);
        this.visitaAnt = visitaAnt;
    }
    
    public void facturar(){
        
    }
    
}
