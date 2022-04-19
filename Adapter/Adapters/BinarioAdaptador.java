package Adapter.Adapters;

import Adapter.Dec.*;
import Adapter.Binario.*;

public class BinarioAdaptador extends NumDec{
    private NumBin binDec;

    public BinarioAdaptador(NumBin binDec) {
        this.binDec = binDec;
    }

    @Override
    public int getNumero() {
        int result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = Integer.parseInt(binDec.getBinario(),2); 
        return result;
    }
}
