package tema8.movil;

public class MovilPlus extends MovilPrepago{
    
    MovilPlus(long nM, float cML, float cMB, float s){
        super(nM, cML, cMB,s);
    }
    
    public void videollamada (int seg){
        float s = super.consultarSaldo() ;
        s -= Math.round(seg * 2);
        if(s < 0)  s = 0;
        super.setSaldo(s);
    }
    
    public void info(){
        System.out.println(super.toString()); 
    }
    
}
