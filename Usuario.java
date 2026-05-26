public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.aumentaCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuiCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentaVolume();
        smartTv.diminuiVolume();

        smartTv.mudarCanal(9);
        System.out.println(smartTv.canal);


    }

}
