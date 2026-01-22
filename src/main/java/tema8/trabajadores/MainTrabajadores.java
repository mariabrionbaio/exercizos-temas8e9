package tema8.trabajadores;

import java.util.*;
import java.time.*;

public class MainTrabajadores {

    static Scanner t = new Scanner(System.in);
    static ArrayList<Asalariado> asalariados = new ArrayList<>();
    static ArrayList<ConsultorExterno> consultores = new ArrayList<>();

    public static void main(String[] args) {

        boolean salir = false;
        while (!salir) {
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    altaTrabajador();
                    break;
                case 2:
                    if (bajaTrabajador()) {
                        System.out.println("Baja correcta");
                    } else {
                        System.out.println("No se encuentra el trabajador");
                    }
                    break;
                case 3:
                    modificarImportes();
                    break;
                case 4:
                    listaTrabajadores();
                    break;
                case 5:
                    System.out.println("Total salarios: " + String.format("%,.2f", totalSalarios()));
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("\n>>>>Opción no válida. Por favor, intenta de nuevo.\n");
            }
        }
        t.close();
    }

    private static int mostrarMenu() {
        System.out.println("\nGestión de Trabajadores\n====================\n");
        System.out.println("1) Alta de trabajador");
        System.out.println("2) Baja de trabajador");
        System.out.println("3) Modificar importes");
        System.out.println("4) Lista de trabajadores");
        System.out.println("5) Importe total salarios");
        System.out.println("0) Salir");
        System.out.print("---Seleccione una opción---\n");
        return Integer.parseInt(t.nextLine());
    }

    static private void altaTrabajador() {
        System.out.println("Introduzca id");
        int id = Integer.parseInt(t.nextLine());
        System.out.println("Introduzca nombre");
        String nombre = t.nextLine();
        System.out.println("Introduzca fecha nacimiento aaaa-mm-dd:");
        LocalDate fecNac = LocalDate.parse(t.nextLine());

        System.out.println("Tipo: 1)Asalariado, 2)Consultor");
        int tipo = t.nextInt();
        t.nextLine();
        if (tipo == 1) {  //asalariado
            System.out.println("Sueldo base del trabajador: ");
            float sueldoB = t.nextFloat();
            t.nextLine();
            System.out.println("Cantidad horas extra: ");
            int he = t.nextInt();
            t.nextLine();
            asalariados.add(new Asalariado(sueldoB, he, id,nombre,fecNac));
        } else {         //consultor
            System.out.println("Horas trabajadas: ");
            int ht = t.nextInt();
            t.nextLine();
            consultores.add(new ConsultorExterno(ht, id, nombre, fecNac));
        }
    }

    static private boolean bajaTrabajador() {
        System.out.println("Introduzca id del trabajador a eliminar: ");
        int id = t.nextInt();
        t.nextLine();
        //buscar en asalariados
        for(Asalariado i : asalariados){
            if(i.getId() == id){
                asalariados.remove(i);
                return true;
            }
        }
        
        //buscar en consultores
        for(ConsultorExterno i : consultores){
            if(i.getId() == id){
                consultores.remove(i);
                return true;
            }
        }
        return false;
    }

    static private void modificarImportes() {
        System.out.println("Introduzca importe horas extra (asalariados)");
        float impHorasExtra = t.nextFloat();
        t.nextLine();
        System.out.println("Introduzca importe horas trabajadas (consultores)");
        float impHorasTrab = t.nextFloat();
        t.nextLine();
        
        Asalariado.importeHoraExtra = impHorasExtra;
        ConsultorExterno.importeHoraTrabajada = impHorasTrab;
        
    }

    static private void listaTrabajadores() {
        System.out.println("=========== ASALARIADOS =============");
        for(Asalariado a: asalariados){
            System.out.println(a.toString());
        }
        System.out.println("========== CONSULTORES EXTERNOS =============");
         for(ConsultorExterno c: consultores){
            System.out.println(c.toString());
        }
    }

    static private float totalSalarios() {
        float total = 0;
        
        for (Asalariado a : asalariados) {
            total += a.calcularSalarioFinal(50);
        }
        for (ConsultorExterno c : consultores) {
            total += c.calcularSalarioFinal(100);
        }
        
        return total;
    }
}
