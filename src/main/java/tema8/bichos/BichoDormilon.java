package tema8.bichos;

class BichoDormilon extends Bicho {

    public int sueño;

    BichoDormilon() {
        sueño = hambre * 2;
    }

    BichoDormilon(int i) {
        super(i, 0);
        sueño = i + 20;
    }

    @Override
    public void come() {
        hambre -= 10;
        sueño += 5;
    }

    public void aDormir() {
        super.come();
        sueño = 0;
    }
}
