package tema9.medico;

import java.time.LocalDate;

public class PacConsulta extends Paciente {
    String motivo;
    
    public PacConsulta(String nombre, LocalDate fecNac, String motivo){
        super(nombre, fecNac);
        this.motivo = motivo;
    }
 
    @Override
    public double facturar(){
        System.out.println("FACTURA: 100€");
        return 100.0;
    }
    
}
