package Command;

public class AcelerarAuto implements Order{
    private Auto rayo;

    public AcelerarAuto(Auto rayo){
        this.rayo = rayo;
    }

    public void execute(){
        rayo.acelerar();
    }
}
