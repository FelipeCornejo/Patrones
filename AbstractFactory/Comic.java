package AbstractFactory;

public class Comic implements Fuente{
    
    @Override
    public void crear() {
        System.out.println("Debería estar escrito en Comic");
    }
}
