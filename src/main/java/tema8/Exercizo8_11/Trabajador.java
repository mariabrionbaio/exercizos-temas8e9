package tema8.Exercizo8_11;

import java.time.LocalDate;
import java.util.Objects;

public class Trabajador {

    private int id;
    private String nombre;
    private LocalDate fechaNac;

    public Trabajador(int id, String nombre, LocalDate fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Trabajador { " + "id = " + id + ", nombre = " + nombre + ", fechaNac = " + fechaNac + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;              // mismo objeto
        }
        if (obj == null) {
            return false;             // null
        }
        if (!(obj instanceof Trabajador)) {
            return false; // distinta clase
        }
        Trabajador other = (Trabajador) obj;  //casteamos obj
        return this.id == other.id;
    }

}
