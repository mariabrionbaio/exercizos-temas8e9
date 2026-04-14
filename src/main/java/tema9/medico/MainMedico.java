package tema9.medico;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMedico {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Paciente> cola = new ArrayList<>();
        double totalFacturado = 0.0;
        String fecha;

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar llegada paciente");
            System.out.println("2. Llamar a consulta");
            System.out.println("3. Consultar total facturado");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Tipo de paciente:");
                    System.out.println("1. Consulta");
                    System.out.println("2. Recetas");
                    System.out.println("3. Revisión");
                    System.out.print("Opción: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Fecha de nacimiento: ");
                    fecha = sc.nextLine();
                    LocalDate fechaNac = LocalDate.parse(fecha);

                    if (tipo == 1) {
                        System.out.print("Motivo de la consulta: ");
                        String motivo = sc.nextLine();
                        cola.add(new PacConsulta(nombre, fechaNac, motivo));

                    } else if (tipo == 2) {
                        System.out.print("Número de medicamentos: ");
                        int numMedicamentos = sc.nextInt();
                        sc.nextLine();

                        ArrayList<String> medicamentos = new ArrayList<>();
                        for (int i = 0; i < numMedicamentos; i++) {
                            System.out.print("Medicamento " + (i + 1) + ": ");
                            medicamentos.add(sc.nextLine());
                        }

                        cola.add(new PacRecetas(nombre, fechaNac, medicamentos));

                    } else if (tipo == 3) {
                        System.out.print("Fecha de la visita anterior: ");
                        fecha = sc.nextLine();
                        LocalDate fechaAnterior = LocalDate.parse(fecha);
                        cola.add(new PacRevision(nombre, fechaNac, fechaAnterior));
                    }

                    break;

                case 2:
                    if (cola.isEmpty()) {
                        System.out.println("No hay pacientes en espera.");
                    } else {
                        Paciente p = cola.remove(0);
                        double importe = p.facturar();
                        totalFacturado += importe;

                        System.out.println("Atendiendo a: " + p.getNombre());
                        System.out.println("Importe: " + importe + " €");
                    }
                    break;

                case 3:
                    System.out.println("Total facturado: " + totalFacturado + " €");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}
        

    
    
    
    
 
    

