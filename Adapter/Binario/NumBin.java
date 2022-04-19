package Adapter.Binario;

/**
 * Binario NO es compatible con Suma. Ya que la suma solo soportará enteros.
 */
public class NumBin {
    private String binario;

    public NumBin(){}

    public NumBin(String binario){
        this.binario = binario;
    }

    public String getBinario() {
        return binario;
    }
}
