package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean sans){   
        if(sans){
            return new FuenteSansFactory();         
        }else{
            return new FuenteFactory();
        }
    }
}
