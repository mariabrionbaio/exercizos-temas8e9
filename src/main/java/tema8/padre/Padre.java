package tema8.padre;

class Padre {

    public String nombre;

    public Padre(String n) {
        nombre = n;
    }

    void cambiaNombre() {
        nombre = nombre.toUpperCase();
    }

    void minusc() {
        nombre = nombre.toLowerCase();
    }
}
