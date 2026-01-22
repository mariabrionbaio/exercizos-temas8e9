package tema8.trabajadores;

import java.time.LocalDate;

public class Trabajador {
    private int id;
    private String nome;
    private LocalDate datanac;

    public Trabajador(int id, String nome, LocalDate datanac) {
        this.id = id;
        this.nome = nome;
        this.datanac = this.datanac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getFechanac() {
        return datanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.datanac = fechanac;
    }
    
    @Override
    public String toString(){
        return "id: " + id + " - nome: " + nome ;
    }
    
}
