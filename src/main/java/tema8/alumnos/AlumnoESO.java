package tema8.alumnos;

/**
 *
 * @author mbdorca
 */
public class AlumnoESO extends Alumno{
    
    public int telefono;
    
    AlumnoESO(){}
    
    AlumnoESO(String nombre, String dni, int telefono){
        super(nombre, dni);
        this.telefono = telefono;
    }
    
    public void nuevaFalta(int sesiones){
        this.faltas += sesiones;
        System.out.println("Falta registrada");
        if(faltas > 30) System.out.println("Llamar a " + telefono);
    }
    
}
