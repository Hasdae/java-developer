public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv(); // forma de criar um novo objeto smartTv a partir da classe SmartTv definida
        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Tv ligada:" + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.mudarCanal(15);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }    
}
