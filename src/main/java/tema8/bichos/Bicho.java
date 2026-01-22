package tema8.bichos;

class Bicho {

    public int hambre;
    public int peso;

    Bicho() {
        hambre = 50;
        peso = 50;
    }

    Bicho(int h, int p) {
        hambre = h;
        peso = p;
    }

    public void come() {
        hambre -= 5;
        peso++;
    }
}
