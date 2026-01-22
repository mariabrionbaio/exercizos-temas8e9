package tema8.movil;

public class MainMovil {

    public static void main(String[] args) {
        
        MovilPrepago mp = new MovilPrepago(555555,0.65f, 0.23f, 30.0f);
        MovilTarifaPlana mtp = new MovilTarifaPlana(3333333, 0.25f, 2.2f, 40);
        MovilPlus mplus = new MovilPlus(111111111, 0.05f, 0.22f, 10.0f);
        
        System.out.println(mp.toString());
        mp.efectuarLlamada(8);
        mp.navegar(500);
        System.out.println(mp.toString());
        
        System.out.println(mtp.toString());
        mtp.efectuarLlamada(8);
        mtp.navegar(500);
        System.out.println(mtp.toString());
        
        System.out.println(mplus.toString());
        mplus.efectuarLlamada(8);
        mplus.navegar(5);
        System.out.println(mplus.toString());
    }
    
}
