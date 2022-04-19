package Command;

public class Auto {
    private int bencina = 70;
    private int velocidad = 0;
    private String nombre = "Rayo Mcqueen";

    public void acelerar(){
        this.bencina = this.bencina - 2;
        this.velocidad = this.velocidad + 10;
        System.out.println(nombre+ " a acelerado! [Velocidad: "+ velocidad + "km/h, Bencina: "+ bencina +" L]");
    }
    public void frenar(){
        this.velocidad = this.velocidad - 10;
        System.out.println(nombre+ " a frenado! [Velocidad: "+ velocidad + "km/h, Bencina: "+ bencina +" L]");
    }
}
