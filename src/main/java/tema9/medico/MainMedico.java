package tema9.medico;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MainMedico {

    public static void main(String[] args) {
        PacConsulta pc1 = new PacConsulta("pepe", LocalDate.of(1999,05,05),"dolor de cabeza" );
        Paciente pr2 = new PacRecetas("ana", LocalDate.of(1952,01,01), new ArrayList<>(List.of("frenadol", "ibuprofeno", "paracetamol")));
        Paciente pr3 = new PacRevision("eva",LocalDate.of(1950, Month.MARCH, 20), LocalDate.of(2026, 01, 15));
    
        pc1.facturar();
        pr2.facturar();
        pr3.facturar();
    
    
    }
    
 
    
}
