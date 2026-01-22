package tema8.movil;

public class MovilPrepago {

    public long numeroMovil;
    final private float costeMinutoLlamada;
    final private float costeConsumoMB;
    private float saldo;

    MovilPrepago(long nM, float cML, float cMB, float s) {
        numeroMovil = nM;
        costeMinutoLlamada = cML;
        costeConsumoMB = cMB;
        saldo = s;
    }

    public void efectuarLlamada(int segundos) {
        saldo -= Math.round((costeMinutoLlamada / 60f * segundos) * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public void navegar(int mb) {
        saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public boolean recargar(int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    public float consultarSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return "Núm de movil: " + numeroMovil + " - Saldo: " + saldo;
    }
    
} //fin 