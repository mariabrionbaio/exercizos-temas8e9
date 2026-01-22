package tema8.bichos;

public class MainBichos {

    public static void main(String[] args) {
        Bicho bi = new Bicho();
        BichoDormilon bd = new BichoDormilon();

        System.out.println("bi -> hambre: " + bi.hambre);
        System.out.println("bd -> hambre: " + bd.hambre);
        System.out.println("bd -> sueño: " + bd.sueño);
        System.out.println("bd -> peso: " + bd.peso);

        bi.come();
        bd.come();
        System.out.println("bi -> hambre: " + bi.hambre);
        System.out.println("bd -> hambre: " + bd.hambre);
        bd.aDormir();
        System.out.println("bd -> hambre: " + bd.hambre);
        System.out.println("bd -> sueño: " + bd.sueño);

        BichoDormilon bd2 = new BichoDormilon(5);
        bd2.come();
        System.out.println("bd2 -> hambre: " + bd2.hambre);

        BichoDormilon bd3 = new BichoDormilon(5);
        bd2.come();
        System.out.println("bd2 -> hambre: " + bd2.hambre);
        System.out.println("bd2 -> sueño: " + bd2.sueño);
        
        System.out.println("------------------- TEMA 9 ------------------------");
        
        Bicho bi2 = new BichoDormilon(10);
        
        System.out.println("bi2 -> hambre: " + bi2.hambre);
        System.out.println("bi2 -> sueño: " + ((BichoDormilon)bi2).sueño);
        
        BichoDormilon bd4 = (BichoDormilon)bi2;
        System.out.println("bd2 -> sueño: " + bd4.sueño);

    }

}
