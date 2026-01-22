package tema8.alumnos;

public class MainAlumno {

    public static void main(String[] args) {
        
        Alumno a1 = new Alumno();
        Alumno a2 = new AlumnoESO("Juan", "111111a", 526358954);
        Alumno a3 = new AlumnoCiclos("Ana", "22222g", "abanca", "ana@gmail.com");
        
        System.out.println(a3.nombre);
        System.out.println(((AlumnoCiclos)a3).empresa);
    }
    
}
