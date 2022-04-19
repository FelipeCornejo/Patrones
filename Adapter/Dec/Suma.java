package Adapter.Dec;

/**
 * Suma es compatible con NumDec.
 */
public class Suma {
    private int sum;

    public Suma(){
    }
    
    public Suma(int sum){
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void Sumatoria(NumDec numero1, int numero2) {
        this.sum = numero1.getNumero() + numero2;
    }
}
