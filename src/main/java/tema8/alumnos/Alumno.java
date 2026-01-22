package tema8.alumnos;

public class Alumno {
    public String nombre;
    public String dni;
    public int faltas;
    
    Alumno(){}
    
    Alumno(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.faltas = 0;
    }
    
    public void resetFaltas(){
        this.faltas = 0;
    }
}
