package sistema_smarth_tv;

public class Usuario {

    public static void main(String[] args) {
        SmarthTv smartTv = new SmarthTv();
        smartTv.ligar();
        smartTv.desligar();
        smartTv.ligar();
        smartTv.aumentaVolume();
        smartTv.diminuirVolume();

        System.out.println(smartTv.ligada);

        smartTv.mudarCanal(3);
        System.out.println(smartTv.canal);
        
        smartTv.subirCanal();
        System.out.println(smartTv.canal);
    }

}
