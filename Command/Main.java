package Command;

public class Main {
    public static void main(String[] args) {
        Auto rayo = new Auto();
  
        AcelerarAuto acelerar = new AcelerarAuto(rayo);
        FrenarAuto frenar = new FrenarAuto(rayo);
  
        Invoker broker = new Invoker();
        for(int i = 0; i < 20; i++){
            broker.takeOrder(acelerar);
        }
        for(int i = 0; i < 20; i++){
            broker.takeOrder(frenar);
        }
  
        broker.placeOrders();
     }
}
