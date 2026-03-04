package tema9.medico;

import java.time.LocalDate;
import java.time.Period;

public class PacRevision extends Paciente{
    LocalDate visitaAnt;
    
    PacRevision(String nombre, LocalDate fecNac, LocalDate visitaAnt){
        super(nombre, fecNac);
        this.visitaAnt = visitaAnt;
    }
    
    public void facturar(){
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = fecNac;
        
        if (Period.between(nacimiento, hoy).getYears() < 65) System.out.println("FACTURA: 50€");
        else    System.out.println("FACTURA: 30€");
    }
    
}
