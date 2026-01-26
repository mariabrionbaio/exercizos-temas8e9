
package tema8.Exercizo8_11;

import java.time.LocalDate;

public class ConsultorExterno extends Trabajador {
    
    private int horasTrabajadas;
    public static double importeHTrabajadas = 100.0;

    public ConsultorExterno(int horasTrabajadas, int id, String nombre, LocalDate fechaNac) {
        super(id, nombre, fechaNac);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalarioFinal(double precioHorasTrab){
        return horasTrabajadas * precioHorasTrab;
    }
    
    
}
