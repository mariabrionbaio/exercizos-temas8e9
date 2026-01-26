package tema8.Exercizo8_11;

import java.time.LocalDate;

public class Asalariado extends Trabajador{
  
    private double salarioBase;
    private int cantHorasExtra;
    
    public static double importeHExtras = 50.0;
    
    public Asalariado(double salarioBase, int cantHorasExtra, int id, String nombre, LocalDate fechaNac) {
        super(id, nombre, fechaNac);
        this.salarioBase = salarioBase;
        this.cantHorasExtra = cantHorasExtra;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getCantHorasExtra() {
        return cantHorasExtra;
    }

    public void setCantHorasExtra(int cantHorasExtra) {
        this.cantHorasExtra = cantHorasExtra;
    }

    public double calcularSalarioFinal(double precioHoraExtra){
        return salarioBase + precioHoraExtra * cantHorasExtra;
    }
   
    
}
