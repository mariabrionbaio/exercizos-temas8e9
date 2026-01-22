package tema8.cuentas;

public class CuentaCorriente {

    public String iban;
    private float saldo;
    private int contadorIngresos;
    private float porcentajeComision;

    CuentaCorriente(String iban, float porcentajeComision) {
        this.iban = iban;
        this.saldo = 0;
        this.porcentajeComision = porcentajeComision;
        this.contadorIngresos = 0;
    }

    public void setComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public float getComision() {
        return porcentajeComision;
    }

    public float getSaldo() {
        return (saldo);
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    

    public void ingresar(float importe) {
        float bonus = 0;
        if (++contadorIngresos == 3) {
            contadorIngresos = 0;
            bonus = 0.7f;
        }
        saldo += importe + bonus;
    }

    public boolean retirar(float importe) {
        float comision = porcentajeComision * importe;
        if (importe + comision <= saldo) {
            saldo -= importe + comision;  //resta (importe+comision)
            contadorIngresos = 0;
            return true;
        } else {
            return false;
        }
    }
} // fin clase
