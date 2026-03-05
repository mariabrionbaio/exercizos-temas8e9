package tema8.Exercizo8_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.time.*;

public class ProgT08E11 {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Asalariado> asalariados = new ArrayList<>();
    static ArrayList<ConsultorExterno> consultores = new ArrayList<>();
    
    
    public static void main(String[] args) throws IOException {
        boolean eof = false;
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("trabajadores.dat"))) {
            while (!eof) {  //mentres non cheguemos ao final do arquivo...
                System.out.println(ois.readObject().getClass());
                if (ois.readObject() instanceof ConsultorExterno)                
                    consultores.add((ConsultorExterno) ois.readObject()); 
                if (ois.readObject() instanceof Asalariado)
                    asalariados.add((Asalariado) ois.readObject());
            }
        } catch (EOFException e) {
            eof = true;
        } catch (IOException | ClassNotFoundException e) {
            // tratamiento de la excepción, por ejemplo: 
            e.printStackTrace();
        }
        
        try(BufferedReader br = Files.newBufferedReader(Path.of("currantes.dat"), StandardCharsets.UTF_8)){
            String linea;
            int lin = 1;
            while((linea = br.readLine()) != null){
                System.out.println("línea: " + lin + " - " + linea);
                lin++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        //inicializar importe horas trabajadas y horas extra
        ConsultorExterno.pvpHTrab = 100.0;
        Asalariado.importeHExtras = 50.0;

        boolean salir = false;
        while (!salir) {
            String opcion = mostrarMenu();
            switch (opcion) {
                case "1":
                    setArquivoStrings(altaTrabajador());
                    break;
                case "2":
                    if (bajaTrabajador()) {
                        System.out.println("Baja correcta");
                    } else {
                        System.out.println("No se encuentra el trabajador");
                    }
                    break;
                case "3":
                    modificarImportes();
                    break;
                case "4":
                    listaTrabajadores();
                    break;
                case "5":
                    System.out.println("Total salarios:" + totalSalarios());
                    break;
                case "0":
                    setArquivoObxectos();
                    
                    salir = true;
                    break;
                default:
                    System.out.println("\n>>>>Opción no válida. Por favor, intenta de nuevo.\n");
            }
        }
        teclado.close();
    }

    private static String mostrarMenu() {
        System.out.println("\nGestión de Trabajadores\n====================\n");
        System.out.println("1) Alta de trabajador");
        System.out.println("2) Baja de trabajador");
        System.out.println("3) Modificar importes");
        System.out.println("4) Lista de trabajadores");
        System.out.println("5) Importe total salarios");
        System.out.println("0) Salir");
        System.out.print("---Seleccione una opción---\n");
        return teclado.nextLine();
    }

    static private String altaTrabajador() {
        System.out.println("Introduzca id");
        int id = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca fecha nacimiento aaaa-mm-dd");
        LocalDate fecNac = LocalDate.parse(teclado.nextLine());

        System.out.println("Tipo: 1)Asalariado, 2) Consultor");
        int tipo = Integer.parseInt(teclado.nextLine());
        if (tipo == 1) {  //asalariado
            System.out.println("Introduzca salario base: ");
            double salBase = teclado.nextDouble();
            teclado.nextLine();
            System.out.println("Introduzca horas extra: ");
            int hExtra = teclado.nextInt();
            teclado.nextLine();
            Asalariado t1 = new Asalariado(id, nombre, fecNac, salBase, hExtra);
            asalariados.add(t1);
            return t1.getNombre();
        } else {         //consultor
            System.out.println("Introduzca horas trabajadas:");
            int hTrab = teclado.nextInt();
            teclado.nextLine();
            Trabajador t2 = new ConsultorExterno(hTrab, id, nombre, fecNac);
            consultores.add((ConsultorExterno)t2);
            return t2.getNombre();
        }
        
    }

    static private boolean bajaTrabajador() {
        System.out.println("Id del trabajador a eliminar:");
        int ident = teclado.nextInt();
        teclado.nextLine();
        
        for(Trabajador tra:asalariados){
            if(tra.getId() == ident){
                asalariados.remove(tra);
                return true;
            }
        }
        for(Trabajador tra:consultores){
            if(tra.getId() == ident){
                consultores.remove(tra);
                return true;
            }
        }
        return false;
    }

    static private void modificarImportes() {
        System.out.println("Introduzca importe horas extra (asalariados)");
        float impHorasExtra = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduzca importe horas trabajada (consultores)");
        float impHorasTrabajada = Float.parseFloat(teclado.nextLine());
        
        Asalariado.importeHExtras = impHorasExtra;
        ConsultorExterno.pvpHTrab = impHorasTrabajada;
    }

    static private void listaTrabajadores() {
        System.out.println("-----ASALARIADOS-------");
        for(Trabajador tra: asalariados){
            System.out.println(tra.toString());
        }
        System.out.println("-----CONSULTORES EXTERNOS-------");
        for(Trabajador tra: consultores){
            System.out.println(tra.toString());
        }
    }

    static private float totalSalarios() {
        float total = 0.0f;
        for( Asalariado tra: asalariados){
            total += tra.calcularSalarioFinal(50.0);
        }
        for(ConsultorExterno con: consultores){
            total += con.calcularSalarioFinal(100);
        }
        return total;
    }
    
    
    static void setArquivoObxectos(){
         //primeiro temos que crear fichero.dat dentro da carpeta raíz do noso proxecto
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("trabajadores.dat"))) {
            //recorremos o array de persoas e imos escribindo cada unha no ficheiro fichero.dat 
            for (Asalariado a : asalariados) {
                oos.writeObject(a);
                System.out.println("Engadida a persona " + a.getNombre());
            }
            for (ConsultorExterno c : consultores) {
                oos.writeObject(c);
                System.out.println("Engadida a persona " + c.getNombre());
            }
        } catch (IOException ex) {
            // tratamiento de la excepción, por ejemplo: 
            ex.printStackTrace();
        }
        
        
    }
    
    static void setArquivoStrings(String c) throws IOException{
        try(BufferedWriter bw = Files.newBufferedWriter(Path.of("currantes.dat"),StandardCharsets.UTF_8, 
                StandardOpenOption.CREATE, StandardOpenOption.APPEND)){    //con APPEND no sobreescribe, sino que añade al final
            bw.write(c + "\n");
            }

    
    
    }
}

