package tema8.Exercizo8_11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainTrabajador {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNac = LocalDate.parse("02/05/1987", formatter);

        Asalariado a1 = new Asalariado(1852.35, 12, 5463, "Pepe", dataNac);
        Asalariado a2 = new Asalariado(1852.35, 12, 5463, "Pepe", dataNac);
        
        a1.toString();
        a2.toString();
        
        System.out.println("Es el mismo trabajador? " + a1.equals(a2));

        System.out.println("O sueldo total é " + a1.calcularSalarioFinal(15.0));
    }

}
