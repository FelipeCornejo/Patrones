package AbstractFactory;

public class FuenteSansFactory extends AbstractFactory{
    @Override
    public Fuente getFuente(String fuenteTipo){    
        if(fuenteTipo.equalsIgnoreCase("NUNITO")){
            return new NunitoSans();         
        }else if(fuenteTipo.equalsIgnoreCase("COMIC")){
            return new ComicSans();
        }	 
        return null;
    }
}
