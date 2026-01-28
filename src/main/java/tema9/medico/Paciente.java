package tema9.medico;

import java.time.LocalDate;

public abstract class Paciente {
    String nombre;
    LocalDate fecNac;
    
    Paciente(String nome, LocalDate fn){
        nombre = nome;
        fecNac = fn;
    }
    
    public abstract void facturar();
    
}
