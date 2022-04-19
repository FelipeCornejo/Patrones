package Command;

public class FrenarAuto implements Order{
    private Auto rayo;

    public FrenarAuto(Auto rayo){
        this.rayo = rayo;
    }

    public void execute(){
        rayo.frenar();
    }
}
