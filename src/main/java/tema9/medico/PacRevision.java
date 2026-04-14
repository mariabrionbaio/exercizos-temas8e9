package tema9.medico;

import java.time.LocalDate;
import java.time.Period;

public class PacRevision extends Paciente{
    LocalDate visitaAnt;
    
    PacRevision(String nombre, LocalDate fecNac, LocalDate visitaAnt){
        super(nombre, fecNac);
        this.visitaAnt = visitaAnt;
    }
    
    public double facturar(){
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = fecNac;
        double fac;
        
        if (Period.between(nacimiento, hoy).getYears() < 65){
                System.out.println("FACTURA: 50€");
                fac = 50.0;
        }
        else    {
            System.out.println("FACTURA: 30€");
            fac = 30.0;
        }
        return fac;
    }
    
}
