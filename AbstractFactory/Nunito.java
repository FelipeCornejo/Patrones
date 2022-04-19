package AbstractFactory;

public class Nunito implements Fuente{
    
    @Override
    public void crear() {
        System.out.println("Debería estar escrito en Nunito");
    }
}
