
package tema8.cuentas;

import java.time.LocalDate;

//con final evitamos que esta clase teña heredeiros
public final class CuentaPlazo extends CuentaCorriente{
    public LocalDate fechaCreacion;
    
    public CuentaPlazo(String iban){
        super(iban, 0.0f);
        this.fechaCreacion = LocalDate.now();
    }

     @Override
    public boolean retirar(float cantidad) {
        if (cantidad > 0 && super.getSaldo() >= cantidad) {
            super.setSaldo(super.getSaldo() - cantidad);
            return true;
        }else{
            return false;
        }
    }
}

