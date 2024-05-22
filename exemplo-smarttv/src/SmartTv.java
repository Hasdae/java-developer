public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void ligar(){
            ligada = true;
        }
        public void desligar(){
            ligada = false;
        }
        public void aumentarVolume(){
            volume += 1; // pode ser usado volume ++
        }
        public void diminuirVolume(){
            volume--; // pode ser usado volume -= 1
        }
        public void mudarCanal (int novoCanal){
            canal = novoCanal;
            System.out.println("Atribuindo novo canal");
        }
        public void aumentarCanal(){
            canal++;
        }
        public void diminuirCanal(){
            canal--;
        }
}
