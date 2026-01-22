package tema8.alumnos;

public class AlumnoCiclos extends Alumno{
    public String empresa;
    public String email;
    
    AlumnoCiclos(){}
    
    AlumnoCiclos(String nombre, String dni, String e, String ema){
        super(nombre, dni);
        empresa = e;
        email = ema;
    }
   
    public void nuevaFalta(int sesiones){
        this.faltas += sesiones;
        System.out.println("Falta registrada. Notificar a " + this.email);
        if(faltas > 50) System.out.println("Alumno dado de baja");
    }
}
