package Adapter;

import Adapter.Adapters.BinarioAdaptador;
import Adapter.Binario.NumBin;
import Adapter.Dec.NumDec;
import Adapter.Dec.Suma;

public class Adapter {

    public static void main(String[] args){
        
        NumDec numDec = new NumDec(3);
        NumBin numBin = new NumBin("1000000000000");

        BinarioAdaptador numBinAdapter = new BinarioAdaptador(numBin);

        Suma result = new Suma(0);
        result.Sumatoria(numDec, numBinAdapter.getNumero());

        System.out.println(result.getSum());
    }
    

    
}
