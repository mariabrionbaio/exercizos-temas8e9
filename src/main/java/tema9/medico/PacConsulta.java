package tema9.medico;

import java.time.LocalDate;

public class PacConsulta extends Paciente {
    String motivo;
    
    public PacConsulta(String nombre, LocalDate fecNac, String motivo){
        super(nombre, fecNac);
        this.motivo = motivo;
    }
    
    void loquesea(){
        System.out.println("lo que sea");
    }
    
    @Override
    public void facturar(){
        System.out.println("FACTURA: 100€");
    }
    
}
