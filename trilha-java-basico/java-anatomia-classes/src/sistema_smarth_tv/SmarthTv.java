package sistema_smarth_tv;

public class SmarthTv {
    int volume = 1;
    int canal = 1;
    boolean ligada = false;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentaVolume() {
        volume += 1;
        System.out.println("Volume atual: " + volume);

    }

    public void diminuirVolume() {
        volume -= 1;
        System.out.println("Volume atual: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void subirCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

}
