package tema8.trabajadores;

import java.time.LocalDate;

public class ConsultorExterno extends Trabajador {
    private int horasTrabajadas;
    //para acceder desde el main
    public static float importeHoraTrabajada = 100;

    public ConsultorExterno(int horasTrabajadas, int id, String nome, LocalDate datanac) {
        super(id, nome, datanac);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalarioFinal(double precioHora){
        return horasTrabajadas * precioHora;
    }
}
