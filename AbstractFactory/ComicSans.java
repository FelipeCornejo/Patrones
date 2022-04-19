package AbstractFactory;

public class ComicSans implements Fuente {
    
    @Override
    public void crear() {
        System.out.println("Debería estar escrito en Comic Sans");
    }
}
