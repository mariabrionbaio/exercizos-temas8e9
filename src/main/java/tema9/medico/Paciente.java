package tema9.medico;

import java.time.LocalDate;

public abstract class Paciente {

    String nombre;
    LocalDate fecNac;

    Paciente(String nome, LocalDate fn) {
        nombre = nome;
        fecNac = fn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }
    
    

    public abstract double facturar();

}
