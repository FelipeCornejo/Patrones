package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        //get Fuente factory
        AbstractFactory FuenteFactory = FactoryProducer.getFactory(false);
        //get an object of Fuente NUNITO
        Fuente Fuente1 = FuenteFactory.getFuente("NUNITO");
        //call crear method of Fuente NUNITO
        Fuente1.crear();
        //get an object of Fuente COMIC 
        Fuente Fuente2 = FuenteFactory.getFuente("COMIC");
        //call crear method of Fuente COMIC
        Fuente2.crear();
        //get Fuente factory
        AbstractFactory FuenteFactory1 = FactoryProducer.getFactory(true);
        //get an object of Fuente NUNITO
        Fuente Fuente3 = FuenteFactory1.getFuente("NUNITO");
        //call crear method of Fuente NUNITO
        Fuente3.crear();
        //get an object of Fuente COMIC 
        Fuente Fuente4 = FuenteFactory1.getFuente("COMIC");
        //call crear method of Fuente COMIC
        Fuente4.crear();
        
    }
}
