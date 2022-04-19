package AbstractFactory;

public class FuenteFactory extends AbstractFactory{
    @Override
    public Fuente getFuente(String fuenteTipo){    
        if(fuenteTipo.equalsIgnoreCase("NUNITO")){
            return new Nunito();         
        }else if(fuenteTipo.equalsIgnoreCase("COMIC")){
            return new Comic();
        }	 
        return null;
    }
}
