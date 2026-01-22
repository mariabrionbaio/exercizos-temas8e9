package tema8.movil;

public class MovilTarifaPlana extends MovilPrepago{
    
    MovilTarifaPlana(long nM, float cML, float cMB, float s) {
        super(nM, cML, 0, s);
    }
    
    @Override
    public void navegar(int mb) {
        float s = super.consultarSaldo() ;
        System.out.println("Navegando gratis con mi Tarifa Plana");
    }
    
}
