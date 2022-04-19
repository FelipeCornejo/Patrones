package AbstractFactory;

public class NunitoSans implements Fuente{

    @Override
    public void crear() {
        System.out.println("Debería estar escrito en NunitoSans");
    }
}
